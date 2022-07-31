package j002.cap21;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

//example 21.10
public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("C", 1000);
		ht.put("Java", 1500);
		ht.put("Vb", 1500);
		
		//display list using Enumeration
		Enumeration<String> courses;
		courses = ht.keys();
		while(courses.hasMoreElements()) {
			String s1 = courses.nextElement();
			System.out.println("Course = "+ s1 
					+ " Fees = "+ ht.get(s1));
		}
		
		//display list using for each
		Set<String> s = ht.keySet();
		for(Object ob : s) {
			System.out.println("Course = "+ (String)ob
					+ " Fees = "+ ht.get((String) ob));
		}
		Integer fees = ht.get("Java");
		ht.put("Java", fees + 1000);
		System.out.println("After Update");
		
		//display list using Iterator
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println("Course = "+ s1
					+ " Fees = "+ ht.get(s1));
		}
	}
}
