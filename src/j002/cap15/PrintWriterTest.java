package j002.cap15;

import java.io.IOException;
import java.io.PrintWriter;

//example 15.16
public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a string");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
	}
}
