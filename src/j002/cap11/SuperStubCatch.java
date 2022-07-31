package j002.cap11;

/*
 * This program contains an error.
 * A subclass must come before its superclass in a
 * series of catch statements.
 * If not, unreachable code will be created and a
 * compile-time error will result.
 */
public class SuperStubCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 42 / a;
		}
		catch(ArithmeticException e) {
			System.out.println("This is now reached");
		}
		catch(Exception e) {
			System.out.println("Generic exception catch");
		}
		/*
		 * this catch is never reached because
		 * ArithmeticException is a sublcass of Exception
		 */
//		catch(ArithmeticException e) {
//			System.out.println("This is never reached");
//		}
	}
}
