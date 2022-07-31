package j002.cap15;

import java.io.IOException;

//example 15.30
public class WriteTest {
	public static void main(String[] args) throws IOException {
		int b;
		b = 'A';
		System.out.write(b);
		
		System.out.flush();		//to flush para exibir o valor
//		System.out.write('\n');	//to flush
	}
}
