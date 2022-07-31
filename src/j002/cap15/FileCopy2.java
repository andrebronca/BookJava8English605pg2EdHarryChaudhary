package j002.cap15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//example 15.5
public class FileCopy2 {
	public static void main(String[] args) throws IOException {
		FileReader fin = null;
		FileWriter fout = null;
		
		String pathFile = "/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/src/j002/cap15/";
		String fileNameOrigem1 = "FileCopy2.java";
		String fileNameOrigem2 = "FileCopy3.java";
		String arquivos[] = new String[2];
		
		arquivos[0] = pathFile + fileNameOrigem1;
		arquivos[1] = pathFile + fileNameOrigem2;
		
		fin = new FileReader(arquivos[0]);
		fout = new FileWriter(arquivos[1]);
		
		int a;
		a = fin.read();
		while(a != -1) {
			fout.write((char) a);
			a = fin.read();
		}
		
		fin.close();
		fout.close();
	}
}
