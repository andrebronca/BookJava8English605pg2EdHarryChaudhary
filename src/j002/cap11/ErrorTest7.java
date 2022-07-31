package j002.cap11;

public class ErrorTest7 {
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("before exception");
			int b = 58 / a;
			int c[] = {1};
			c[47] = 100;
			System.out.println("after exception");
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero: "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: "+ e);
		}
		System.out.println("After try/catch block");
	}
}
