package j002.cap11;

public class ErrorTest10 {
	int age;
	void setAge(int a) {
		if(a > 0) {
			age = a;
		} else {
			NullPointerException e = new NullPointerException("Invalid Age: "+ a);
			throw e;
			//throw new NullPointerException("Invalid Age");
		}
	}
	
	public static void main(String[] args) {
		ErrorTest10 a1 = new ErrorTest10();
		try {
			a1.setAge(20);
			a1.setAge(-10);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
