package j002.cap05;

//example 5.15
public class Outer2 {
	static class Inner {
		int member_inner = 7;
		Inner(){
//			member_outer = 5; error
//			System.out.println(member_outer); error
			Outer2 obj = new Outer2();
			obj.member_outer = 5;
			System.out.println(obj.member_outer);
		}
	}
	
	private int member_outer;
	
	void prn() {
		Inner obj = new Inner();
		System.out.println(obj.member_inner);
	}
}

class ClassTest14{
	public static void main(String[] args) {
		Outer2 out_obj = new Outer2();
		out_obj.prn();
	}
}
