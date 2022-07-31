package j002.cap05;

public class A8 {
	int x;
	static int y;
}

class ClassTest8{
	public static void main(String[] args) {
		A8 a1 = new A8();
		A8 a2 = new A8();
		A8 a3 = new A8();
		a1.x = 10;
		a1.y = 20;
		a2.x = 11;
		a2.y = 21;
		a3.x = 12;
		a3.y = 22;
		System.out.println(a1.x +"\t"+ a1.y);
		System.out.println(a2.x +"\t"+ a2.y);
		System.out.println(a3.x +"\t"+ a3.y);
	}
}
