package j002.cap11;

import java.util.Random;

public class HandleError {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, tot = 0;
		Random r = new Random();
		
		for(int i = 0; i < 32000; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 1234 / (b / c);
			}
			catch (ArithmeticException e) {
				System.out.println("Division by zero");
				System.out.println("Exception: "+ e);
				a = 0; //set a and continue
				tot++;
			}
			System.out.println("a: "+ a);
		}
		System.out.println("Total de exception: "+ tot);
	}
}
