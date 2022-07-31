package j002.cap15;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//example 15.19
public class TextGenerator extends Thread {
	OutputStream out;
	public TextGenerator(OutputStream out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		try {
			try {
				for(byte b = 35; b <= 125; b++) {
					out.write(b);
				}
			} finally {
				out.close();
			} 
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

class Pipe{
	public static void main(String[] args) throws IOException {
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in = new PipedInputStream(out);
		TextGenerator data = new TextGenerator(out);
		data.start();
		int ch;
		while((ch = in.read()) != -1) {
			System.out.print((char) ch);
		}
	}
}
