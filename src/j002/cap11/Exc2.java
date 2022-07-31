package j002.cap11;

public class Exc2 {
	public static void main(String[] args) {
		int d, a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("nao sera impresso");
		}
		catch(ArithmeticException e) {
			System.out.println("divisão por zero");
		}
		System.out.println("Depois de capturar o erro");
	}
}
