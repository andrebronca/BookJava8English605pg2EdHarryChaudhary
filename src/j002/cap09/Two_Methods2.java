package j002.cap09;

interface Two_Methods2 {
	abstract void m1();
	abstract void m2();
}
interface One_Method2 extends Two_Methods2{
	void m3();
}
class Three_Methods2 implements One_Method2{
	@Override
	public void m1() {
		System.out.println("m1");
	}
	@Override
	public void m2() {
		System.out.println("m2");
	}
	@Override
	public void m3() {
		System.out.println("m3");
	}
}
class Methods_Demo2{
	public static void main(String[] args) {
		Three_Methods2 tm1 = new Three_Methods2();
		tm1.m1();
		tm1.m2();
		tm1.m3();
	}
}