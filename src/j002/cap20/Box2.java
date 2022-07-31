package j002.cap20;

//example 20.3
public class Box2 {
	double w, h, d;

	public Box2(double w, double h, double d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	@Override
	public String toString() {
		return "Dimensions are "+ w 
				+" by "+ h + " by "+ d +".";
	}
}

class ToStringDemo2{
	public static void main(String[] args) {
		Box2 b = new Box2(10, 12, 14);
		String s = "Box b: "+ b;
		System.out.println(b);
		System.out.println(s);
	}
}
