package j002.cap09;

public interface Two_Methods {
	void m1();
	void m2();
}

class Three_Methods implements Two_Methods{

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}
	
	public void m3() {
		System.out.println("m3");
	}
}

class Methods_Demo{
	public static void main(String[] args) {
		Two_Methods tm1 = new Three_Methods();
		tm1.m1();
		tm1.m2();
		
		Three_Methods tm2 = new Three_Methods();
		tm2.m3();
	}
}