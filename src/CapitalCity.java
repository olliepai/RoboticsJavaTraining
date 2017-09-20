
public class CapitalCity extends City{
	public CapitalCity(String name, String state, boolean isCoastal) {
		super(name, state, isCoastal);
	}
	
	public String toString() {
		return super.toString() + " It is also a capital.";
	}
}
