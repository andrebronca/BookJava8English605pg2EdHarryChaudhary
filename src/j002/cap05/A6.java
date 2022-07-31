package j002.cap05;

public class A6 {
	private int x;
	private int y;
	private String s;
	
	void display() {
		System.out.println(x +"\t"+ y + "\t"+ s);
	}
}

class ClassTest6 {
	public static void main(String[] args) {
		A6 a = new A6();
		a.display();
	}
}
