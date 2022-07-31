package j002.cap15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//example 15.17
public class PrintWriterTest1 {
	public static void main(String[] args) throws IOException {
		FileWriter fout = new FileWriter("test.dat");
		PrintWriter pw = new PrintWriter(fout, true);
		pw.println("this is a string");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
		pw.close();
	}
}
