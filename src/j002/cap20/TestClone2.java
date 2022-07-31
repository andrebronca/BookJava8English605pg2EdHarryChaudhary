package j002.cap20;

//example 20.6
public class TestClone2 implements Cloneable {
	int a;
	float b;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class CloneDemo2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone2 tc1 = new TestClone2();
		TestClone2 tc2;
		tc1.a = 8;
		tc1.b = 4.5f;
		tc2 = (TestClone2) tc1.clone();
		System.out.println(tc2.a);
		System.out.println(tc2.b);
	}
}
