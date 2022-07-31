package j002.cap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//example 15.27
public class BufferedReaderTest2 {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit");
		c = (char) br.read();
		
		while(c != 'q') {
			System.out.print(c);
			c = (char) br.read();
		}
	}
}
