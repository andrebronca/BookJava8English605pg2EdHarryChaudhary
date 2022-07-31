package j002.cap12;

//exemplo 12.12
public class A9 {
	static synchronized void display(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
	}
}

class B9 implements Runnable{
	A9 obj;
	String msg;
	Thread t;
	public B9(A9 obj1, String m) {
		msg = m;
		obj = obj1;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		obj.display(msg);
	}
}

class Synch5{
	public static void main(String[] args) {
		A9 a1 = new A9();
		A9 a2 = new A9();
		A9 a3 = new A9();
		B9 b1 = new B9(a1, "hello");
		B9 b2 = new B9(a2, "world");
		B9 b3 = new B9(a3, "matrix");
	}
}