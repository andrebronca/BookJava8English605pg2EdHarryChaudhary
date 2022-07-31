package j002.cap05;

public class A11 {
	void m1() {
		System.out.println("Inside m1()");
	}
}

class ClassTest11{
	public static void main(String[] args) {
		final int x = 10;	//can't change
		final int y;	//y not initialized so we can initialize y later
		y = 20;	//now y is initialized so after this we can't change its value
//		y = 30;	error
		System.out.println(x);
		System.out.println(y);
		final A11 a1 = new A11();	//a1 is a constant reference so we can not
		//assign reference of any other object in f1
		a1.m1();
		A11 a2 = new A11();
//		a1 = a2; error
		
	}
}
