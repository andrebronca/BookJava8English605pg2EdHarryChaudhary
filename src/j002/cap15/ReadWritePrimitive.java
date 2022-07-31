package j002.cap15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//example 15.25
public class ReadWritePrimitive {
	public static void main(String[] args) throws IOException {
		File primitive = new File("prim.dat");
		FileOutputStream fos = new FileOutputStream(primitive);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(1999);
		dos.writeDouble(222.44);
		dos.writeBoolean(false);
		dos.writeChar('X');
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(primitive);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		dis.close();
		fis.close();
	}
}
