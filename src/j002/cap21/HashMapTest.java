package j002.cap21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//example 21.6
public class HashMapTest {
	public static void main(String[] args) {
		//armazena em ordem diferente as keys
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("C", 1000);
		hm.put("C++", 1000);
		hm.put("PHP", 10);
		hm.put("Java", 1500);
		hm.put("Javascript", 900);
		hm.put("SQL", 2000);
		System.out.println(hm);
		
		//HashMap não tem Iterator, precisa armazenar em outra collection
		Set s = hm.entrySet();
		//Set tem iterator
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> me 
				= (Map.Entry<String,Integer>) itr.next();
			System.out.print(me.getKey() +": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		int fees = ((Integer)hm.get("Java")).intValue();
		hm.put("Java", fees + 1000);
		System.out.println("New Fees of Java: "+ hm.get("Java"));
	}
}
