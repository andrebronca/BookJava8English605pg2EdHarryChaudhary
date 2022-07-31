package j002.cap21;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//example 21.8
public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		System.out.println("Size is "+ v1.size() 
			+" capacity is "
			+ v1.capacity());
		for(int i = 1; i <= 15; i++) {
			v1.addElement(i);
		}
		//size: quantos elementos pode aceitar
		//capacity: quantos elementos possui
		System.out.println("Size is "+ v1.size() 
		+" capacity is "
		+ v1.capacity());
		
		Iterator<Integer> iterator = v1.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +" ");
		}
		System.out.println();
		
		for(int i : v1) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		Enumeration<Integer> e = v1.elements();
		while(e.hasMoreElements()) {
			System.out.print( e.nextElement() +" ");
		}
		System.out.println();
		
		Integer a[] = new Integer[v1.size()];
		v1.copyInto(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		System.out.println("First element = "+ v1.firstElement());
		System.out.println("Last element = "+ v1.lastElement());
	}
}
