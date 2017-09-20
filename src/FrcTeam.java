
public class FrcTeam extends FirstTeam {
	public FrcTeam(String name, int number) {
		super(name, number);
	}
	
	public String compete() {
		return "Get ready to take flight.";
	}
	
	public static void main(String[] args) {
		FrcTeam warlords = new FrcTeam("Warlord", 2485);
		System.out.println(warlords.compete());
	}
}
