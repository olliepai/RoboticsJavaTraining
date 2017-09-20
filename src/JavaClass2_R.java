import javax.swing.JOptionPane;

public class JavaClass2_R {
	public static void main(String[] args) {
		printThree(smallestFactor(289));
		System.out.println(countdown(20));
	}

	public static boolean odd(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void perfectSquare() {
		for (int i = 1; i < 1001; i++) {
			System.out.println(i*i);
		}
	}
	
	public static void divSeven() {
		for (int i = 1; i < 10001; i++) {
			if  (i % 17 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void printThree(int num) {
		for (int i = 0; i < 3; i++) {
			System.out.println(num);
		}
	}
	
	public static int smallestFactor(int num) {
		int factor = 2;
		while (factor < num) {
			if (num % factor == 0) {
				return factor;
			}
			else {
				factor++;
			}
		}
		return num;
	}
	
	public static void cats() {
		String preference = JOptionPane.showInputDialog("Do you prefer cats over dogs?");
		if (preference.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You are wrong.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good choice.");
		}
	}
	
	public static String countdown (int startTime) {
		if (startTime > 0) {
			return startTime + "... " + countdown(startTime - 1);
		}
		else {
			return "Go!";
		}
	}
}
