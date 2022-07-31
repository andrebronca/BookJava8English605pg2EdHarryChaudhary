package j002.cap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		int n;
		String pathFile = "/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/src/j002/cap15/";
		String fileNameOrigem1 = "FileTest.java";
		String fileNameOrigem2 = "FileTest2.java";
		FileInputStream fin = new FileInputStream( pathFile + fileNameOrigem1);
		FileOutputStream fout = new FileOutputStream(pathFile + fileNameOrigem2);
		
		byte b[] = new byte[1000];
		n = fin.read(b);
		while(n != -1) {
			fout.write(b, 0, n);
			System.out.println(n);
			n = fin.read(b);
		}
		fin.close();
		fout.close();
	}
}
