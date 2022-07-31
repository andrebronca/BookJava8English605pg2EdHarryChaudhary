package j002.cap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//exmaple 15.15
public class PrintStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("teste.dat");
		PrintStream ps = new PrintStream(fout, true);
		ps.println("This is a string");
		int i = -7;
		ps.println(i);
		double d = 4.5e-7;
		ps.println(d);
	}
}
