package j002.cap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//example 15.2
public class FileRead {
	public static void main(String[] args) {
		FileInputStream fin = null;
		int a;
		try {
			fin = new FileInputStream(args[0]);
			System.out.println("Nr. of characters to read = "
					+ fin.available());
			fin.skip(3);
			a = fin.read();
			while(a != -1) {
				System.out.print((char) a);
//				System.out.println(a);	//exibe o código do caracter
				a = fin.read();
			}
			System.out.println("Nr. of characters to read = "
					+ fin.available());
			fin.close();
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch( FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
