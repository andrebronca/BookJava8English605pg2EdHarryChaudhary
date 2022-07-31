package j002.cap15;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.Writer;

//example 15.20
public class TextGenerator2 extends Thread {
	Writer out;
	public TextGenerator2(Writer out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		try {
			try {
				for(char c = 'a'; c <= 'z'; c++) {
					out.write(c);
				}
			} finally {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				System.out.println("aaaaaaaaa");
				if (true) {
					return;	//IOException: pipe broken
				}
				out.close(); //IOException: write and dead
			}	//ok if thread finishes after closing the pipe
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}

class Pipe2{
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(System.out);
		PipedWriter out = new PipedWriter();
		PipedReader in = new PipedReader(out);
		TextGenerator2 data = new TextGenerator2(out);
		data.start();
		int ch;
		while((ch = in.read()) != -1) {
			System.out.print((char) ch);
		}
	}
}