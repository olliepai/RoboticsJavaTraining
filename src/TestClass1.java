
public class TestClass1 {
	public static void main(String[] args) {
		TestClass1 object = new TestClass1(0);
		TestClass1 object2 = new TestClass1(0);
		object.increment();
		object2.increment();
	}
	int num;
	TestClass1(int num) {
		this.num = num;
	}
	public void increment() {
		num ++;
		System.out.println(num);
	}
}
