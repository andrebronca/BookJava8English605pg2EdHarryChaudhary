package j002.cap05;

public class A5 {
	private int x, y;
	
	void setData(int x1) {
		x = y = x1;
	}
	
	//overloading
	void setData(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	void display() {
		System.out.println(x +"\t"+ y);
	}
}

class ClassTest5{
	public static void main(String[] args) {
		A5 a1 = new A5();
		a1.setData(5);
		a1.display();
		
		A5 a2 = new A5();
		a2.setData(10,12);
		a2.display();
	}
}
