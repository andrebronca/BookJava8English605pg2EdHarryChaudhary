package j002.cap21;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//example 21.5
public class CompTest {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComp());
		ts.add("C");
		ts.add("A");
		ts.add("D");
		ts.add("E");
		ts.add("F");
		ts.add("B");
		//display the elementos
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o +"");
		}
	}
}

class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String aStr, bStr;
		aStr = (String) o1;
		bStr = (String) o2;
		//reverse comparison
		return bStr.compareTo(aStr);
	}
}