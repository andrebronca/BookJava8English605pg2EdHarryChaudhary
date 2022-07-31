package j002.cap11;

public class A {
	void display() {
		
	}
}

class ErrorTest2{
	public static void main(String[] args) {
		A a1 = null;
		a1.display(); //NullPointerException
	}
}
