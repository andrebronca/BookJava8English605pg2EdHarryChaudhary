package j002.cap21;

import java.util.Iterator;
import java.util.LinkedList;

//example 21.2
public class LinkedListTest {
	public static void main(String[] args) {
		//create a linked list
		LinkedList<String> l1 = new LinkedList<>();
		//add elements to the linked list
		l1.add("F");
		l1.add("B");
		l1.add("D");
		l1.add("E");
		l1.add("C");
		l1.addLast("Z");
		l1.addFirst("A");
		l1.add(1, "A2");
		System.out.println("Original Contents of l1: "+ l1);
		//remove element
		l1.remove("F");
		l1.remove(2);
		System.out.println("Contents of l1 after deletion: "+ l1);
		//remove the first and last elements
		l1.removeFirst();
		l1.removeLast();
		System.out.println("l1 after deleting first and last: "+ l1);
		//get and set a value
		String val = l1.get(2);
		l1.set(2, val + " changed");
		System.out.println("l1 after change: "+ l1);
		Iterator itr = l1.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
