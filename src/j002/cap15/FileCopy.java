package j002.cap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//example 15.3
public class FileCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream(args[0]);
		fos = new FileOutputStream(args[1]);
		
		int a;
		a = fis.read();
		while(a != -1) {
			fos.write(a);
			a = fis.read();
		}
		fis.close();
		fos.close();
	}
}
