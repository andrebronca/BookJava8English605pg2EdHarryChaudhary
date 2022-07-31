package j002.cap10;

import java.util.Scanner;

public class StringArrSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many names");
		int n = sc.nextInt();
		String s[] = new String[n];
		
		//recebendo nomes
		for(int i = 0; i < n; i++) {
			System.out.println("Enter name "+ (i + 1));
			s[i] = sc.next();
		}
		
		//ordenando: sort
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					String t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
		
		
	}
}
