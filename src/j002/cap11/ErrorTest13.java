package j002.cap11;

public class ErrorTest13 {
	int age;
	void setAge(int a) {
		if(a > 0) {
			age = a;
		} else {
			NullPointerException e = new NullPointerException("Admission Failed");
			e.initCause(new ArithmeticException("Age is invalid"));
			throw e;
		}
	}
	
	public static void main(String[] args) {
		ErrorTest13 a1 = new ErrorTest13();
		try {
			a1.setAge(20);
			a1.setAge(-10);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
