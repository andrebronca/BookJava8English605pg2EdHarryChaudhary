package j002.cap20;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//example 20.1
public class DispClassMembers1 {
	public static void main(String[] args) {
		String s = new String("Hello");
		Class c = s.getClass();
		Method m[] = c.getMethods();
		System.out.println("... Public Methods ("+ m.length +") ...");
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		Field f[] = c.getFields();
		System.out.println("... Public Fields ("+ f.length +") ...");
		for(int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		m = c.getDeclaredMethods();
		System.out.println("... Declared Methods ("+ m.length +") ...");
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		
		f = c.getDeclaredFields();
		System.out.println("... Declared Fields ("+ f.length +") ...");
		for(int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	}
}
