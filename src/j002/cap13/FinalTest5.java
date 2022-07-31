package j002.cap13;

public class FinalTest5 {
	final int x;
	public static void main(String[] args) {
		FinalTest5 f = new FinalTest5();
		System.out.println(f.x);
	}
	
	public FinalTest5() {
		x = 10;
	}
}
