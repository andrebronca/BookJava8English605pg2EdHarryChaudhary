package j002.cap13;

public class FinalTest8 {
	static final int x;
	public static void main(String[] args) {
		System.out.println(FinalTest8.x);
	}
	
	static {
		x = 20;
	}
}
