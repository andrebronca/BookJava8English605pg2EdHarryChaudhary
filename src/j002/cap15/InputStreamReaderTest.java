package j002.cap15;

import java.io.IOException;
import java.io.InputStreamReader;

//example 15.26
public class InputStreamReaderTest {
	public static void main(String[] args) throws IOException{
		char c;
		InputStreamReader is = new InputStreamReader(System.in);
		System.out.println("Enter characters, 'q' to quit");
		c = (char) is.read();
		while(c != 'q') {
			System.out.print(c);
			c = (char) is.read();
		}
	}
}
