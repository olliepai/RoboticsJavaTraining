import javax.swing.JOptionPane;

public class JavaClass1_IC {
	public static void main(String[] args) {		
		System.out.println("Hello World");
		
		//--
		
		System.out.println((double)(6/7));
		System.out.println(Math.cos(Math.toRadians(43)));
		
		//--
		
		System.out.println(Math.toRadians(Math.PI));
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.PI);
		System.out.println((int)(Math.random() * 101));
		
		//--
		
		double pi = Math.PI;
		boolean yes = true;
		
		//--
		
		String name = "Ollie";
		int age = 14;
		age++;		
		System.out.println("Hello " + name + ", you are " + age + " years old."); 
		
		//--
		
		double number = 5;
		double newNumber = Math.cos(number + 6 / 4 * 15);
		System.out.println(newNumber);
		System.out.println((int)(Math.random() * newNumber));
		
		//--
		
		int x = 3;
		int y = 3;
		
		if (x == y) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		//--
		
		double z = 5;
		double t = 3;
		
		if (z > t) {
			System.out.println(z);
		}
		else {
			System.out.println(t);
		}
		
		//--
		
		int a = 5;
		int b = 3;
		int c = 2;
		
		if (a + b < c || a + c < b || b + c < a) {
			System.out.println("not a triangle");
		}		
		else {
			System.out.println("triangle");
		}
		
		//--
		
		if (x > 0) {
			if (x < 10) {
				System.out.println(x);
			}
		}
		
		//--
		
		if (x < 0) {
			System.out.println(x);
		}
		if (x > 10) {
			System.out.println(x);
		}
		
		//--
		
		System.out.println(x == y? "equal" : "not equal");
		
		//--
		
		if (x == 1) {
			System.out.println("a");
		}
		else if (x == 4) {
			System.out.println("blah");
			System.out.println("b");
		}
		else {
			System.out.println("c");
		}
		
		//--
		
		String name2 = JOptionPane.showInputDialog(null, "what is your name");
		System.out.println(name2);
		
		//--
		
		String iceCreamFlavor = JOptionPane.showInputDialog("What is your favorite flavor of ice cream?");
		
		if (iceCreamFlavor.equals("chocolate")) {
			JOptionPane.showMessageDialog(null, "yuck");
		}
		else if (iceCreamFlavor.equals("vanilla")) {
			JOptionPane.showMessageDialog(null, "yuck");
		}
		else if (iceCreamFlavor.equals("strawberry")) {
			JOptionPane.showMessageDialog(null, "yuck");
		}
		else if (iceCreamFlavor.equals("mint")) {
			JOptionPane.showMessageDialog(null, "yuck");
		}		
	}
}
