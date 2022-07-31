package j002.cap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//example 15.23, página 351
public class BufferedReaderTest {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");
		BufferedReader b1 = new BufferedReader(fr);
		for(int i = 1; i <= 10; i++) {
			System.out.print((char) b1.read());
		}
		System.out.println();
		if(b1.markSupported()) {
			b1.mark(5);
			for(int i = 1; i <= 10; i++) {
				System.out.print((char) b1.read());
			}
			System.out.println();
			b1.reset();
			
			for(int i=1; i <= 10; i++) {
				System.out.println((char) b1.read());
			}
		} else {
			System.out.println("Marking options is not available");
		}
		b1.close();
		fr.close();
	}
}
