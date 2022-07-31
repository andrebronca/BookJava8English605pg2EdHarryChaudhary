package j002.cap15;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

//example 15.10
public class CharArrayWriterTest {
	public static void main(String[] args) throws IOException {
		CharArrayWriter f = new CharArrayWriter();
		String s = "This should end up in the array";
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		f.write(buf);
		System.out.println(f.toString());
		char c[] = f.toCharArray();
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		System.out.println("--------");
		char d[] = buf;
		for(char cc : d) {
			System.out.print(cc);
		}
		
		FileWriter f2 = new FileWriter("test.txt");
		f.writeTo(f2);
		f2.close();
		f.reset();
		System.out.println();
		System.out.println("After reset: "+ f.toString());
		for(int i = 0; i < 3; i++) {
			f.write('A');
		}
		System.out.println(f.toString());
	}
}
