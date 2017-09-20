
public class State {
	private String name;
	private CapitalCity city;
	private int year;
	
	public State (String name, CapitalCity city, int year) {
		this.name = name;
		this.city = city;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName() + " became a state in " + year + " and has its capital in " + city.getName();
	}
	
	public static void main(String[] args) {
		CapitalCity sacramento = new CapitalCity("Sacramento", "California", false);;
		State california = new State("California", sacramento, 1849);
		System.out.println(sacramento.toString());
		System.out.println(california);
		 
	}
}
