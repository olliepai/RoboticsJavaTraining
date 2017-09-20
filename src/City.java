
public class City {
	private String name;
	private String state;
	private boolean isCoastal;
	
	public City(String name, String state, boolean isCoastal) {
		this.name = name;
		this.state = state;
		this.isCoastal = isCoastal;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " is in " + state + " and is " + (isCoastal ? "coastal." : "not coastal." );
	}
}
