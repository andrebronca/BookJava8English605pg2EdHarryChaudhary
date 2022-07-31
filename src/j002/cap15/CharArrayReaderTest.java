package j002.cap15;

import java.io.CharArrayReader;
import java.io.IOException;

//example 15.9
public class CharArrayReaderTest {
	public static void main(String[] args) throws IOException {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		int tam = tmp.length();
		char c[] = new char[tam];
		
		System.out.println(c);
		tmp.getChars(0, tam, c, 0);
		
		System.out.println(tmp);
		System.out.println(c);
		
		CharArrayReader input1 = new CharArrayReader(c);
		CharArrayReader input2 = new CharArrayReader(c, 0, 5);
		int i;
		
		while((i = input1.read()) != -1) {
			System.out.print((char) i);
		}
		
		System.out.println();
		while((i = input2.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
