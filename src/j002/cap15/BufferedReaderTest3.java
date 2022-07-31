package j002.cap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//example 15.28
public class BufferedReaderTest3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter 'stop' to quit");
		String str = br.readLine();
		while( !str.equalsIgnoreCase("stop")) {
			System.out.println("Your Name: "+ str);
			str = br.readLine();
		}
	}
}
