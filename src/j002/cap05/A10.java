package j002.cap05;

public class A10 {
	int x;
	static int y;
	
	{	//initialize block to initialize instance variables
		x = 10;
	}
	
	static {	//static block to initialize static variables
		y = 5;
	}
}

class ClassTest10{
	public static void main(String[] args) {
		A10 a1 = new A10();
		System.out.println(a1.x +"\t"+ a1.y);
	}
}
