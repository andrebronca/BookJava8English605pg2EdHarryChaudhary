package j002.cap15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

//example 15.6
public class RandomIO {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile("rand.dat", "rw");
			file.writeChar('X');
			file.writeInt(1999);
			file.writeDouble(222.44);
			System.out.println("(1) File pointer Pos: "
					+ file.getFilePointer());
			file.seek(0);	//volta para o início do arquivo
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			System.out.println("(2) File pointer Pos: "
					+ file.getFilePointer());
			file.seek(2);
			System.out.println("(3) File pointer Pos: "
					+ file.getFilePointer());
			System.out.println(file.readInt());
			file.seek(file.length());
			file.writeBoolean(false);
			file.seek(14);
			System.out.println(file.readBoolean());
			System.out.println("(4) File pointer Pos: "
					+ file.getFilePointer());
			System.out.println(file.readInt()); //EOF Exception
		} catch (EOFException e) {
			System.out.println("Tentando ler depois do fim do arquivo");
		}
		finally {
			file.close();
		}
	}
}
