package j002.cap15;

import java.io.BufferedOutputStream;
import java.io.IOException;

//example 15.22
public class BufferedOutputStreamTest {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream f = new BufferedOutputStream(System.out, 100);
		byte buf[] = "This will not be displayed without flush()\n".getBytes();
		f.write(buf);
		f.write(buf);
		System.out.println("testing...");
		f.write(buf);
//		f.flush(); //or
//		f.close();
	}
}
