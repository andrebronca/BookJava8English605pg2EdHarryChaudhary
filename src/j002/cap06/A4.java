package j002.cap06;

//exemplo 6.4
//herança multinível
public class A4 {
	private int x;
	A4(){
		x = 0;
	}
	A4(int x1){
		x = x1;
	}
	void display() {
		System.out.println(x);
	}
}

class B4 extends A4{
	private int y;
	B4(){
		super();
		y = 0;
	}
	B4(int x1, int y1){
		super(x1);
		y = y1;
	}
	void display() {
		super.display();
		System.out.println(y);
	}
}

class C4 extends B4{
	private int z;
	C4(){
		super();
		z = 0;
	}
	C4(int x1, int y1, int z1){
		super(x1, y1);
		z = z1;
	}
	void display() {
		super.display();
		System.out.println(z);
	}
}

class InheritTest4{
	public static void main(String[] args) {
		C4 c1 = new C4();
		c1.display();
		
		C4 c2 = new C4(10, 20, 30);
		c2.display();
	}
}
