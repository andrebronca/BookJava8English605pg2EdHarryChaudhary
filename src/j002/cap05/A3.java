package j002.cap05;

public class A3 {
	private int x;
	private int y;
	
	void setData(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	void display() {
		System.out.println(x +"\t"+ y);
	}
	
	public static void main(String args[]) {
		A2 a1 = new A2();
		A2 a2 = new A2();
		//a1.x = 10; //error, x is private
		a1.setData(10, 20);
		a2.setData(5, 7);
		a1.display();
		a2.display();
	}
}
