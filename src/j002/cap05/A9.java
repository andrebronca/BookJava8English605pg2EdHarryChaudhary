package j002.cap05;

public class A9 {
	int x;
	static int y;
	static int sum(int a, int b) {
		//y = 5; no error static method can access static variable
		//x = 10; error static method can't access instance variable
		//A9 a1 = new A9();
		//a1.x = 10; no error as static method can access instance variable
		//through objects
		//this.x = 10; error as static method can't access this or super keyword
		int c;
		c = a + b;
		return(c);
	}
	
	static float avg(int a, int b) {
		return (float) (a + b) / 2;
	}
	
	
}

class ClassTest{
	public static void main(String[] args) {
		System.out.println(A9.sum(5, 6)); //static methods can be called through class name
		
		System.out.println(A9.avg(5, 6));
		
		A9 a1 = new A9();
		System.out.println(a1.sum(5, 6));
	}
}
