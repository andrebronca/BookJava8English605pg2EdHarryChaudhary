package j002.cap15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

//example 15.21
public class BufferedInputStreamTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("A.txt");
		BufferedInputStream b1 = new BufferedInputStream(fin);
		for(int i = 1; i <= 10; i++) {
			System.out.println((char) b1.read());
		}
		System.out.println();
		
		if(b1.markSupported()) {
			b1.mark(500);
			for(int i = 1; i <= 10; i++) {
				System.out.print((char) b1.read());
			}
			System.out.println();
			b1.reset();
			
			for(int i = 1; i <= 10; i++) {
				System.out.print((char) b1.read());
			}
		} else {
			System.out.println("Marking option is not available");
		}
		b1.close();
		fin.close();
	}
}
