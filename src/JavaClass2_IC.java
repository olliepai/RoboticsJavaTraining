import javax.swing.JOptionPane;

public class JavaClass2_IC {
	public static void main(String[] args) {
		// int x = 0;
		// while (x < 10) {
		// System.out.println("Ollie");
		// x++;
		// }
		//
		// int x = 10;
		// while (x < 100) {
		// System.out.println(x);
		// x++;
		// }
		//
		// while (true) {
		// int rand = (int) (Math.random() * 6 + 1);
		// int num = JOptionPane.showOptionDialog(null, "Would you like to roll a
		// dice?", "Dice Roller", JOptionPane.YES_NO_OPTION, 0, null, null, null);
		// if (num == 0) {
		// JOptionPane.showMessageDialog(null, "You rolled " + rand);
		// }
		// if (num == 1) {
		// System.exit(0);
		// }
		// }
		//
		// for (int i = 0; i < 10; i++) {
		// System.out.println("Ollie");
		// }
		//
		// for (int i = 10; i < 100; i++) {
		// System.out.println(i);
		// }
		//
		// for (int i = 99; i > 9; i--) {
		// System.out.println(i);
		// }
		//
		// for (int i = 1; i < 6; i++) {
		// for (int j = 1; j < 6; j++) {
		// System.out.println("(" + i + ", " + j + ")");
		// }
		// }
//
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < 6; j++) {
//				if (i != j) {
//					System.out.println("(" + i + ", " + j + ")");
//				}
//			}
//		}
//		
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < 6; j++) {
//				if (i > j) {
//					System.out.println("(" + i + ", " + j + ")");
//				}
//			}
//		}
//		
//		randomNumberGenerator();
//		
//		for (int i = 0; i < 5; i ++) {
//			print4();
//		}
//		
//		printInt(6);
//		
//		System.out.println(getTens(943478));
//		
//		System.out.println(doSomething(2, 5));
//		long originalTime = System.nanoTime();
//		int x = 2 + 2;
//		long newTime = System.nanoTime();
//		System.out.println(newTime - originalTime);
//		
//		JOptionPane.showMessageDialog(null, "Hello");
//		
//		String intS = JOptionPane.showInputDialog("Give me you favorite integer.");
//		int intI = Integer.parseInt(intS);
//		
//		double doubleI = Double.parseDouble(JOptionPane.showInputDialog("Give me your favorite decimal."));
////		System.out.println(doubleI);
//		
//		int hand = JOptionPane.showOptionDialog(null, "Are you left handed?", "Hands", JOptionPane.YES_NO_OPTION, 0, null, null, null);
//		if (hand == 0) {
//			JOptionPane.showMessageDialog(null, "yes");
//		}
//		if (hand == 1) {
//			JOptionPane.showMessageDialog(null, "no");
//		}
//		
//		double x = Math.random();
//		if (x > 0.5) {
//			System.out.println("heads");
//		}
//		else {
//			System.out.println("tails");
//		}
	}
	
	public static void randomNumberGenerator() {
		System.out.println((int) (Math.random() * Integer.MAX_VALUE));
	}
	
	public static void print4() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void printInt(int num) {
		for (int i = num; i > -1; i--) {
			System.out.println(i);
		}
	}
	
	public static int getTens(int num) {
		int newNum = (int)((num % 100)/10);
		return newNum;
	}
	
	public static int doSomething(int a, int b) {
		if (b > 0) {
			return a * doSomething(a, b - 1);
		}
		else {
			return 1;
		}
	}
}
