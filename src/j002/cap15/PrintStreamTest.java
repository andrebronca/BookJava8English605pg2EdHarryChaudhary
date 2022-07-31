package j002.cap15;

import java.io.IOException;
import java.io.PrintStream;

//example 15.14
public class PrintStreamTest {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(System.out, true);
		ps.println("This is a string");
		int i = -7;
		ps.println(i);
		double d = 4.5e-7;
		ps.println(d);
	}
}
