package j002.cap22;

//pagina 574
public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.print("abc");
	}

}
