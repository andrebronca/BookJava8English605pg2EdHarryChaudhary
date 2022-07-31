package j002.cap10;

import java.util.Scanner;

public class FindTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter a string");
		s1 = sc.nextLine();
		
		System.out.println("Enter string to search");
		s2 = sc.nextLine();
		
		int ans = s1.indexOf(s2);
		if(ans == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found at pos "+ ans);
		}
	}
}
