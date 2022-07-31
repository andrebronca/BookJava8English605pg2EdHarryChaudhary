package j002.cap21;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//example 21.7
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("C", 1000);
		tm.put("C++", 1000);
		tm.put("Java", 1500);
		
		Set<Map.Entry<String, Integer>> s = tm.entrySet();
		for(Map.Entry<String, Integer> me : s) {
			System.out.println(me.getKey() +" : "+ me.getValue());
		}
		System.out.println();
		
		int fees = tm.get("Java");
		tm.put("Java", fees + 1000);
		System.out.println("New fees of Java: "+ tm.get("Java"));
	}
}
