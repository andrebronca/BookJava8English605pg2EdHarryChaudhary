package j002.cap20;

//example 20.3
public class Box {
	double w, h, d;

	public Box(double w, double h, double d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
}

class ToStringDemo1{
	public static void main(String[] args) {
		Box b = new Box(10, 12, 14);
		String s = "Box b: "+ b;
		System.out.println(b);
		System.out.println(s);
	}
}
