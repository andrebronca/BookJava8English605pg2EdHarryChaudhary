package j002.cap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

//example 15.11
public class PushbackInputStreamTest {
	public static void main(String[] args) throws IOException {
		String pathFile = "/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/src/j002/cap15/";
		String fileNameOrigem1 = "PushbackInputStreamTest.java";
		
		FileInputStream fin = new FileInputStream(pathFile + fileNameOrigem1);
		PushbackInputStream p1 = new PushbackInputStream(fin);
		
		int ch = p1.read();
		System.out.println((char) ch);
		
		ch = p1.read();
		System.out.println((char) ch);
		
		ch = p1.read();
		System.out.println((char) ch);
		
		p1.unread(ch);
		System.out.println((char) ch);
		
		ch = p1.read();
		System.out.println((char) ch);
		
		ch = p1.read();
		System.out.println((char) ch);
		
	}
}
