package j002.cap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//example 15.13
public class SequenceInputStreamTest {
	public static void main(String[] args) throws IOException {
		String pathFile = "/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/src/j002/cap15/";
		String file1 = pathFile + "PushbackInputStreamTest.java";
		String file2 = pathFile + "SequenceInputStreamTest.java";
		String file3 = pathFile + "SequenceTest.java";
		FileInputStream f1 = new FileInputStream(file1);
		FileInputStream f2 = new FileInputStream(file2);
		FileOutputStream f3 = new FileOutputStream(file3);
		
		SequenceInputStream sis = new SequenceInputStream(f1, f2);
		int c;
		while((c = sis.read()) != -1) {
			f3.write(c);
		}
		
		f3.close();
		f2.close();
		f1.close();
	}
}
