package j002.cap11;

public class ErrorTest6 {
	public static void main(String[] args) {
		try {
			int a = 10, b = 2, c = 2, d;
			System.out.println("Before Exception");
			d = a / (b - c);
			System.out.println("nao sera impresso");
		} catch (ArithmeticException e) {
			System.out.println("after exception");
			System.out.println("error: Division by zero");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
}
