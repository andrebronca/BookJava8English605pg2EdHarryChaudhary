package j002.cap21;

import java.util.TreeSet;

//example 21.4
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("C");
		ts.add("A");
		ts.add("D");
		ts.add("E");
		ts.add("F");
		ts.add("B");
		System.out.println(ts);
	}
}
