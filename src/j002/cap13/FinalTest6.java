package j002.cap13;

public class FinalTest6 {
	final int x;
	
	public FinalTest6(int x1) {
		x = x1;
	}
	
	public static void main(String[] args) {
		FinalTest6 f1 = new FinalTest6(10);
		FinalTest6 f2 = new FinalTest6(20);
		System.out.println(f1.x);
		System.out.println(f2.x);
	}
}
