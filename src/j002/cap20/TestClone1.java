package j002.cap20;

//example 20.5
public class TestClone1 implements Cloneable {
	int a;
	float b;

	public TestClone1 clone2() throws CloneNotSupportedException {
		return (TestClone1) clone();
	}
}

class CloneDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone1 tc1 = new TestClone1();
		TestClone1 tc2;
		tc1.a = 8;
		tc1.b = 4.5f;
		tc2 = tc1.clone2();
		System.out.println(tc2.a);
		System.out.println(tc2.b);
	}
}
