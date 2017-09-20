
public class JavaClass4_IC {
	public static void main(String[] args) {
		// JavaClass4_IC test = new JavaClass4_IC("Ollie");
		// JavaClass4_IC test2 = new JavaClass4_IC("Jeremy");
		// test.talk();
		// test2.talk();

		// JavaClass4_IC object = new JavaClass4_IC(0);
		// JavaClass4_IC object2 = new JavaClass4_IC(0);
		// object.increment();
		// object2.increment();
		// JavaClass4_IC fract1 = new JavaClass4_IC(4, 5);
		// JavaClass4_IC fract2 = new JavaClass4_IC(3, 2);
		//
		// JavaClass4_IC fractM = fract1.mult(fract2);
		// System.out.println(fractM.numerator + "/" + fractM.denominator);
		// JavaClass4_IC fractD = fract1.div(fract2);
		// System.out.println(fractD.numerator + "/" + fractD.denominator);
		// double dec = fract1.dec();
		// System.out.println(dec);
		// String frac = fract1.frac();
		// System.out.println(frac);
		
//		JavaClass4_IC lotteryTicket1 = new JavaClass4_IC(5.60, "ticket1", 4, 6, 1);
//		JavaClass4_IC lotteryTicket2 = new JavaClass4_IC(5.60, "ticket1", 4, 6, 1);
//		
//		boolean equals = lotteryTicket1.equals(lotteryTicket2);
//		if (equals == true) {
//			System.out.println("The lottery tickets are equal.");
//		}
//		else {
//			System.out.println("The lottery tickets are not equal.");
//		}
	}

	// private String name = "";

	// JavaClass4_IC(String name) {
	// System.out.println("Hello");
	// this.name = name;
	// }

	// JavaClass4_IC(int num) {
	// this.num = num;
	// }

	// int num;
	//
	// int numerator;
	// int denominator;
	//
	// int numeratorM;
	// int denominatorM;
	//
	// int numeratorD;
	// int denominatorD;

	// JavaClass4_IC(int numerator, int denominator) {
	// this.numerator = numerator;
	// this.denominator = denominator;
	// }
	//
	// public void talk() {
	// System.out.println("Bye " + name);
	// }
	//
	// public void increment() {
	// num++;
	// System.out.println(num);
	// }
	//
	// public JavaClass4_IC mult(JavaClass4_IC fract) {
	// numeratorM = this.numerator * fract.numerator;
	// denominatorM = this.denominator * fract.denominator;
	// return new JavaClass4_IC(numeratorM, denominatorM);
	// }
	//
	// public JavaClass4_IC div(JavaClass4_IC fract) {
	// numeratorD = this.numerator * fract.denominator;
	// denominatorD = this.denominator * fract.numerator;
	// return new JavaClass4_IC(numeratorD, denominatorD);
	// }
	//
	// public double dec() {
	// double fractD = (double) numerator / (double) denominator;
	// return fractD;
	//
	// }
	// public String frac() {
	// return numerator + "/" + denominator;
	// }
	
//	double prize;
//	String name;
//	int[] secret;
//	
//	JavaClass4_IC(double prize, String name, int... secret) {
//		this.prize = prize;
//		this.name = name;
//		this.secret = secret;
//	}
//	
//	public boolean equals(Object obj) {
//		if (obj instanceof JavaClass4_IC) {
//			JavaClass4_IC other = (JavaClass4_IC) obj;
//			if (this.prize == other.prize && this.name.equals(other.name) && this.secret.length == other.secret.length) {
//				for (int i = 0; i < this.secret.length; i++) {
//					if (this.secret[i] == other.secret[i]) {
//					
//					}
//					else {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
//		else {
//			return false;
//		}
//		return false;
//	}
	
	String name;
	String extension;
	int byteSize;
	
	JavaClass4_IC(String name, String extension, int byteSize) {
		this.name = name;
		this.extension = extension;
		this.byteSize = byteSize;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public void setByteSize(int byteSize) {
		this.byteSize = byteSize;
	}
	
	public String getName() {
		return name;
	}
	
	public String getExtension() {
		return extension;
	}
	
	public int getByteSize() {
		return byteSize;
	}
	
}
