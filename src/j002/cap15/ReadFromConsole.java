package j002.cap15;

import java.io.IOException;

//example 15.29
public class ReadFromConsole {
	public static void main(String[] args) throws IOException{
		char c;
		System.out.println("Enter characters, 'q' to quit");
		c = (char) System.in.read();
		
		while( c != 'q') {
			System.out.print(c);
			c = (char) System.in.read();
		}
	}
}
