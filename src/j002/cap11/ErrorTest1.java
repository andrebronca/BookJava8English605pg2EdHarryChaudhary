package j002.cap11;

public class ErrorTest1 {
	public static void main(String[] args) {
		int a = 5, b = 2, c = 2, d;
		d = a / (b - c);	//ARithmeticException(Divide by zero)
		System.out.println(d);
		System.out.println("Não será impresso");
	}
}
