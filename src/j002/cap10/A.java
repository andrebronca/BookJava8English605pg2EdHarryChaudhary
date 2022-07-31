package j002.cap10;

public class A {
	private int x, y;
	A(){
		x = y = 0;
	}
	
	A(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class ToStringTest1{
	public static void main(String[] args) {
		A a1 = new A(5,6);
		System.out.println(a1); //toString() of object is called
		
		String s1 = "Object a1 is "+ a1; //concat calling toString()
		System.out.println(s1);
	}
}
