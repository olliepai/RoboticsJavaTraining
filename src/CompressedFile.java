
public class CompressedFile extends JavaClass4_IC {

	CompressedFile(String name, int byteSize) {
		super(name, "zip", byteSize);
		
	}
	
	public int getByteSize() {
		return super.byteSize/2;
	}

}
