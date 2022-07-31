package j002.cap05;

import java.util.Random;

//example 5.16
public class RandomTest {
	public static void main(String[] args) {
		Random r1 = new Random();
		for(int i = 1; i <= 10; i++) {
			System.out.println(Math.abs(r1.nextInt()));
		}
		r1 = null;
		System.gc();
		Runtime.getRuntime().gc();
	}
}
