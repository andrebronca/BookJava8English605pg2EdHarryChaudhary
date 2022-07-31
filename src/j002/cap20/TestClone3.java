package j002.cap20;

//example 20.6
public class TestClone3 {
	int a;
	float b;

	//método clone próprio
	public Object clone(){
		TestClone3 tc = new TestClone3();
		tc.a = a;
		tc.b = b;
		return tc;
	}
}

class CloneDemo3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone3 tc1 = new TestClone3();
		TestClone3 tc2;
		tc1.a = 8;
		tc1.b = 4.5f;
		tc2 = (TestClone3) tc1.clone();
		System.out.println(tc2.a);
		System.out.println(tc2.b);
	}
}
