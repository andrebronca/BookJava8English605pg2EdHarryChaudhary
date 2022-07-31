package j002.cap10;

public class WordCount {
	public static void main(String[] args) {
		String s1 = "Mohan Das Karam Chand Gandhi";
		boolean flag = false;
		int cnt = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == ' ') {
				flag = false;
			} else {
				if(!flag) {
					flag = true;
					cnt++;
				}
			}
		}
		System.out.println("Nr. of words = "+ cnt);
	}
}
