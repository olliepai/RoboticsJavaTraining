import java.util.ArrayList;

public class Folder {
	String name;
	ArrayList<JavaClass4_IC> files = new ArrayList<>();
	
	Folder(String name) {
		this.name = name;
	}
	
	public void addFile(String name, String extension, int byteSize) {
		files.add(new JavaClass4_IC(name, extension, byteSize));
	}
	
	public int getTotalSize() {
		int size = 0;
		for (int i = 0; i < files.size(); i++) {
			size += files.get(i).byteSize;
		}
		return size;
	}
}
