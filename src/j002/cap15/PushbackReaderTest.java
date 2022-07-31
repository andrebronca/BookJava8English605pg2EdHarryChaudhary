package j002.cap15;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

//example 15.12
public class PushbackReaderTest {
	public static void main(String[] args) throws IOException {
		String pathFile = "/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/src/j002/cap15/";
		String fileNameOrigem1 = "PushbackInputStreamTest.java";
		FileReader fr = new FileReader(pathFile + fileNameOrigem1);
		PushbackReader pr = new PushbackReader(fr);
		int ch = pr.read();
		System.out.println((char) ch);
		
		ch = pr.read();
		System.out.println((char) ch);
		
		ch = pr.read();
		System.out.println((char) ch);
		
		pr.unread(ch);
		ch = pr.read();
		System.out.println((char) ch);
	}
}
