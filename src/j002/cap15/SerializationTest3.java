package j002.cap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest3 {
	public static void main(String[] args) throws IOException {
		try {
			MyClass3 object1 = new MyClass3("Hello", 99, 123.45);
			System.out.println(object1);
			
			FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("(1) before writing object");
			oos.writeObject(object1);
			System.out.println("(1) after writing object");
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			MyClass3 object2;
			FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("(2) before reading object");
			object2 = (MyClass3) ois.readObject();
			System.out.println("(2) after reading object");
			ois.close();
			System.out.println(object2);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class MyClass3 implements Serializable{
	private static final long serialVersionUID = 1L;
	String s;
	int i = 100;
	double d;

	public MyClass3() {
	}
	
	public MyClass3(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	
	public String toString() {
		return "s = "+ s +"; i = "+ i +"; d = "+ d;
	}
	
	public void writeExternal(ObjectOutput oos) throws IOException{
		System.out.println("Inside writeExternal");
		oos.writeObject(s);
		oos.writeInt(i);
		oos.writeDouble(d);
	}
	
	public void readExternal(ObjectInput ois) 
			throws ClassNotFoundException, IOException{
		System.out.println("Inside readExternal");
		s = (String) ois.readObject();
		i = ois.readInt();
	}
}

