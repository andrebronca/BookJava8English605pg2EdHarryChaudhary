package j002.cap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//example 15.32
public class SerializationTest2 {
	public static void main(String[] args) throws IOException {
		try {
			MyClass2 object1 = new MyClass2("Hello", 123, 1.3e3);
			MyClass2 object3 = new MyClass2("Hello1", 1, 2);
			object3.x = 200;
			A object5 = new A();
			System.out.println(object1);
			System.out.println(object3);
			System.out.println(object5);
			
			FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.writeObject(object3);
			oos.writeObject(object5);
			object3.x = 400;
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			MyClass2 object2, object4;
			A object6;
			FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (MyClass2) ois.readObject();
			object4 = (MyClass2) ois.readObject();
			object6 = (A) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("After deserialization");
			System.out.println(object2);
			System.out.println(object4);
			System.out.println(object6);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class MyClass2 implements Serializable{
	String s;
	transient private int i = 100;
	public static int x = 10;
	double d;
	public MyClass2(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
		x = 100;
	}
	
	@Override
	public String toString() {
		return "s = "+ s +"; i = "+ i +"; d = "+ d +"; x = "+ x;
	}
}

class A implements Serializable{
	@Override
	public String toString() {
		return "Class A";
	}
}