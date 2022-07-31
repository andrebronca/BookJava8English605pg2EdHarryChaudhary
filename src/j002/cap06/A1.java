package j002.cap06;

//exemplo 6.1
public class A1 {
	int x;
	
	void setX(int x1) {
		x = x1;
	}
	
	void displayX() {
		System.out.println(x);
	}
}

class B1 extends A1{
	int y;
	
	void setY(int y1) {
		y = y1;
	}
	
	void displayY() {
		System.out.println(y);
	}
}

class InheritTest1{
	public static void main(String[] args) {
		A1 a1 = new A1();	//4 bytes
		a1.setX(5);
		a1.displayX();
		B1 b1 = new B1(); //8 bytes
		b1.setX(10);
		b1.setY(20);
		b1.displayX();
		b1.displayY();
		
	}
}
