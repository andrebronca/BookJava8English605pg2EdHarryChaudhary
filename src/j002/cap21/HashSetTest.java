package j002.cap21;

import java.util.HashSet;

//example 21.3
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
		//os elementos não são armazenados na ordem
		//em que são adicionados.
//		[A, B, C, E, F]
		//TreeSet armazena em ordem 
	}
}
