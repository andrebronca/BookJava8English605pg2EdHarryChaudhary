package j002.cap15;

import java.io.ByteArrayInputStream;
import java.io.IOException;

//example 15.7
public class ByteArrayInputStreamTest {
	public static void main(String[] args) throws IOException {
		String s1 = "abcdefghijk";
		byte b[] = s1.getBytes();
		
		ByteArrayInputStream b1 = new ByteArrayInputStream(b);
		int a;
		
		while((a = b1.read()) != -1) {
			System.out.print((char) Character.toUpperCase(a));
		}
		
		b1.close();
 	}
}
