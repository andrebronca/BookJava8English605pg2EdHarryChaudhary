package j002.cap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//example 15.31
public class SerializationTest {
	public static void main(String[] args) throws IOException {
		try {
			MyClass object1 = new MyClass("Hello", 123, 1.3e3);
			MyClass object2 = new MyClass("Hello1", 1, 2);
			System.out.println(object1);
			System.out.println(object2);
			
			FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.writeObject(object2);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			MyClass object3, object4;
			FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object3 = (MyClass) ois.readObject();
			object4 = (MyClass) ois.readObject();
			ois.close();
			System.out.println("After deserialization");
			System.out.println(object3);
			System.out.println(object4);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class MyClass implements Serializable{
	String s;
	int i = 100;
	double d;
	public MyClass(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	
	@Override
	public String toString() {
		return "s = "+ s +"; i = "+ i +"; d = "+ d;
	}
}