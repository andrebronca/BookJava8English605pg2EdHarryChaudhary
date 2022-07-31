package j002.cap06;

//exemplo 6.3
//herança única
public class A3 {
	private int x;
	
	A3(){
		x = 0;
	}
	
	A3(int x1){
		x = x1;
	}
	
	void display() {
		System.out.println(x);
	}
}

class B3 extends A3{
	private int y;
	
	B3(){
		super();
		y = 0;
	}
	
	B3(int x1, int y1){
		super(x1);
		y = y1;
	}
	
	void display() {
		super.display();
		System.out.println(y);
	}
}

class InheritTest3{
	public static void main(String[] args) {
		B3 b1 = new B3();
		b1.display();
		
		B3 b2 = new B3(10, 20);
		b2.display();
	}
}