package j002.cap13;

public class FinalTest4 {
	final int x;
}

class MyClass4{
	public static void main(String[] args) {
		FinalTest4 f = new FinalTest4();
		f.x = 10;
		System.out.println(f.x);
	}
}
