package j002.cap21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//example 21.1
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList<>();
		System.out.println("Initial size of a1: "+ a1.size());
		a1.add("A");
		a1.add("C");
		a1.add(new Integer(56));
		a1.add("E");
		a1.add("F");
		a1.add(1,"B");
		System.out.println("Size of a1 after additions: "+ a1.size());
		System.out.println("Contents of a1: "+ a1);
		a1.remove("F");
		a1.remove(2);
		System.out.println("Size of a1 after deletions: "+ a1.size());
		System.out.println("Content of a1 "+ a1);
		
		ArrayList<String> a2 = new ArrayList<>(20);
		//can add only Strings objects capacity is 20
		a2.ensureCapacity(25); //from 20 to 25 capacity
		a2.ensureCapacity(22);
		a2.add("A");
		a2.add("B");
		a2.add("C");
		a2.add("D");
		a2.add("E");
//		a2.add(new Integer(5)); //not compile
		System.out.println("Contents of a2: "+ a2);
		a2.remove("D");
		System.out.println(a2);
		a2.remove(0);
		System.out.println(a2);
		a2.clear();
		System.out.println(a2);
		
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(new Integer(1));
		a3.add(new Integer(2));
		a3.add(new Integer(3));
		a3.add(4); //auto boxing
		System.out.println("Contents of a3: "+ a3);
		for(int i = 0; i < a3.size(); i++) {
			System.out.print(a3.get(i)+ " ");
		}
		System.out.println();
		Object b[] = a3.toArray();
		for(int i = 0; i < b.length; i++) {
			System.out.print((Integer) b[i] +" ");
		}
		System.out.println(); //linha 51
		System.out.println("Contents of a3 using iterator: ");
		Iterator itr = a3.iterator();
		while(itr.hasNext()) {
			int x = ((Integer) itr.next()).intValue();
			System.out.print(x + " ");
		}
		System.out.println();
		
		//changing the list using ListIterator
		ListIterator<Integer> litr = a3.listIterator();
		while(litr.hasNext()) {
			Integer element = litr.next();
			litr.set(element + 10);
		}
		
		//printing the list in reverse order
		while(litr.hasPrevious()) {
			Integer element = litr.previous();
			System.out.print(element +" ");
		}
		System.out.println();
		
		System.out.println("Contents of a3 using for each loop");
		for(int i : a3) { //auto unboxing
			System.out.print(i + " ");
		}
		System.out.println();
		
		Integer ia[] = new Integer[a3.size()];
		a3.toArray(ia);
		int sum = 0;
		
		for(int i = 0; i < ia.length; i++) {
			sum += ia[i].intValue();
		}
		
		System.out.println("Sum is "+ sum);
		a3.trimToSize();
	}
}
