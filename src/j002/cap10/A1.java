package j002.cap10;

public class A1 {
	private int x, y;
	A1(){
		x = y = 0;
	}
	A1(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return x +","+ y;
	}
}

class ToStringTest2{
	public static void main(String[] args) {
		A1 a1 = new A1(5,7);
		System.out.println(a1); //toString() called
		
		String s1 = "Object a1 is "+ a1;
		System.out.println(s1);
	}
}
