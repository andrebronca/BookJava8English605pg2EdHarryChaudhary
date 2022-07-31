package j002.cap13;

public class FinalTest7 {
	final int x;
	public static void main(String[] args) {
		FinalTest7 f = new FinalTest7();
		System.out.println(f.x);
	}
	
	//initialization block
	{
		x = 20;
	}
}
