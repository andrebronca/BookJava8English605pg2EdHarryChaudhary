package j002.cap11;

public class Nested {
	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 58 / a;
			System.out.println("a = "+ a);
			try {
				if (a == 1) {
					a = a / (a - a);
				}
				if (a == 2) {
					int c[] = {1};
					c[42] = 100;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndex oob "+ e);
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
