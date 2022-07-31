package j002.cap05;

public class A4 {
	private int x;
	private int y;
	
	void setData(int x, int y) {
		this.x = x;	//this.x is the class member & x is local variable
		this.y = y;
	}
	
	void display() {
		System.out.println(x +"\t"+ y);
	}
}

class ClassTest4 {
	public static void main(String[] args) {
		A4 a1 = new A4();
		A4 a2 = new A4();
		a1.setData(10, 20);
		a2.setData(7, 5);
		a1.display();
		a2.display();
	}
}
