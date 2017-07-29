import javax.swing.JOptionPane;

public class JavaClass1_P {
//	Create a program that can convert between metric and nonmetric units
//	Start by creating a program that asks for a distance in miles and tells the the distance in km
//	Now, ask the user first whether their starting unit is (K for km or M for miles), and then convert appropriately
//	Try this with other unit conversions
//	Volume: 1 gallon = 3.7854 liters
//	Weight / Force: 1 pound = 4.44822 newtons
//	Temperature: Fahrenheit = Celsius * 1.8 + 32
//	Power: 1 horsepower = 745.7 Watt
//	Energy: 1 calorie = 4184 Joule
//	To integrate these unit conversions into a single program, begin by asking the user what type of unit conversion they would like to do
//	Bonus: support more than two units per type of unit (i.e. cm, inches, and miles)
	
	public static void main(String[] args) {
		for (int i = 0; i > -1; i++) {
			JavaClass1_P converter = new JavaClass1_P();

			String type = JOptionPane.showInputDialog(
					"What would you like to convert?\n(distance, volume, force, temperature, power, or energy)");

			switch (type) {
			case "distance":
				converter.converter("distance", "miles", "kilometers", 1.60934, 0.621371);
				break;

			case "volume":
				converter.converter("volume", "gallons", "liters", 3.7854, 0.264);
				break;

			case "force":
				converter.converter("force", "pounds", "newtons", 4.44822, 0.224809);
				break;

			case "temperature":
				converter.converterT("temperature", "Farenheit", "Celsius", "Kelvin");
				break;

			case "power":
				converter.converter("power", "horsepower", "watts", 745.7, 0.00134102);
				break;

			case "energy":
				converter.converter("energy", "calories", "joules", 4184, 0.239006);
				break;
			}
		}
	}

	public void converter(String t, String u1, String u2, double c1, double c2) {
		String direction = JOptionPane.showInputDialog(u1 + " to " + u2 + " or " + u2 + " to " + u1 + "?");
		if (direction.equals(u1 + " to " + u2)) {
			String o1S = JOptionPane.showInputDialog("Enter the " + t + " you want to convert. (in " + u1 + ")");
			int o1I = Integer.parseInt(o1S);
			double o2I = o1I * c1;
			JOptionPane.showMessageDialog(null, o1I + " " + u1 + " is " + o2I + " " + u2);
		}

		if (direction.equals(u2 + " to " + u1)) {
			String o1S = JOptionPane.showInputDialog("Enter the " + t + " you want to convert. (in " + u2 + ")");
			int o1I = Integer.parseInt(o1S);
			double o2I = o1I * c2;
			JOptionPane.showMessageDialog(null, o1I + " " + u2 + " is " + o2I + " " + u1);
		}
	}

	public void converterT(String t, String u1, String u2, String u3) {
		String direction = JOptionPane.showInputDialog(u1 + " to " + u2 + " and " + u3 + " or " + u2 + " to " + u1 + " and " + u3 + " or " + u3 + " to " + u1 + " and " + u2 +"?");
		if (direction.equals(u1 + " to " + u2 + " and " + u3)) {
			String o1S = JOptionPane.showInputDialog("Enter the " + t + " you want to convert. (in " + u1 + ")");
			int o1I = Integer.parseInt(o1S);
			double o2I = (o1I - 32) / 1.8;
			double o3I = (o1I + 459.67)/(9/5);
			JOptionPane.showMessageDialog(null, o1I + "° " + u1 + " is " + o2I + "° " + u2 + " and " + o3I + " " + u3);
		}

		if (direction.equals(u2 + " to " + u1 + " and " + u3)) {
			String o1S = JOptionPane.showInputDialog("Enter the " + t + " you want to convert. (in " + u2 + ")");
			int o1I = Integer.parseInt(o1S);
			double o2I = o1I * 1.8 + 32;
			double o3I = o1I - 274.15;
			JOptionPane.showMessageDialog(null, o1I + "° " + u2 + " is " + o2I + "° " + u1 + " and " + o3I + " " + u3);
		}
		
		if (direction.equals(u3 + " to " + u1 + " and " + u2)) {
			String o1S = JOptionPane.showInputDialog("Enter the " + t + " you want to convert. (in " + u3 + ")");
			int o1I = Integer.parseInt(o1S);
			double o2I = (o1I * (9/5)) - 459.67;
			double o3I = o1I + 273.15;
			JOptionPane.showMessageDialog(null, o1I + " " + u3 + " is " + o2I + "° " + u1 + " and " + o3I + "° " + u2);
		}
	}

}
