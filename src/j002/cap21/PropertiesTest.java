package j002.cap21;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

//example 21.11
public class PropertiesTest {
	public static void main(String[] args) {
		String cursos[] = {"C", "C++", "Java", "Dot Net", "VB"};
		Properties def = new Properties();
		def.put("C", "2 months");
		def.put("C++", "3 months");
		Properties courses = new Properties(def);
		courses.put("Java", "4 months");
		courses.put("Dot Net", "6 months");
		System.out.println("Duration of ");
		for(String c : cursos) {
			System.out.println("Duration of "+ c 
					+ " is "
					+ courses.getProperty(c, "Not Found"));
		}
		
		System.out.println("List of all Courses: ");
		Set s = courses.keySet();
		for(Object ob : s) {
			
			System.out.println("Duration of "+ ob 
					+ " is "
					+ courses.getProperty((String)ob, "Not Found"));
		}
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println("Duration of "+ s1 
					+ " is "
					+ courses.getProperty(s1, "Not Found"));
		}
	}
}
