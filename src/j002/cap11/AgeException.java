package j002.cap11;

public class AgeException extends Exception {
 	public AgeException(String msg) {
 		super(msg);
	}
}

class ErrorTest12{
	int age;
	void setAge(int a) throws AgeException {
		if (a > 0) {
			age = a;
		} else {
			throw new AgeException("Invalid Age: "+ a);
		}
	}
	
	public static void main(String[] args) {
		ErrorTest12 a1 = new ErrorTest12();
		try {
			a1.setAge(20);
			a1.setAge(-10);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
