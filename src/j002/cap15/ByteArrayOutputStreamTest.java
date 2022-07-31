package j002.cap15;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

//example 15.8
public class ByteArrayOutputStreamTest {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream b1 = new ByteArrayOutputStream();
		b1.write('a');
		String s1 = "abcdefghijk";
		byte arr1[] = s1.getBytes();
		b1.write(arr1);
		
		//display using toString()
		System.out.println(b1);
		
		//display using for loop
		byte arr2[] = b1.toByteArray();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print((char) arr2[i]);
		}
		System.out.println();
		
		//display using for each loop
		for(int i : arr2) {
			System.out.print((char) i);
		}
		
		b1.close();
	}
}
