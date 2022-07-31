package j002.cap05;

//exemple 5.14
public class Outer {
	class Inner {
		int member_inner = 7;
		Inner(){
			member_outer = 5;
			System.out.println(member_outer);
		}
	}
	private int member_outer;
	
	Outer(){
//		member_inner = 9;	//error, só acessa por instância
		Inner obj = new Inner();
		System.out.println(obj.member_inner);
	}
}

class ClassTest13{
	public static void main(String[] args) {
		Outer out_obj = new Outer();
	}
}
