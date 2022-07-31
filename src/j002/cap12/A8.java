package j002.cap12;

//exemplo 12.11
public class A8 {
	synchronized void display(String msg) {
		System.out.print("["+ msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
	}
}

class B8 implements Runnable{

	A8 obj;
	String msg;
	Thread t;
	
	public B8(A8 obj1, String m) {
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

class Synch4{
	public static void main(String[] args) {
		A8 a1 = new A8();
		A8 a2 = new A8();
		A8 a3 = new A8();
		B8 b1 = new B8(a1, "hello");
		B8 b2 = new B8(a2, "world");
		B8 b3 = new B8(a3, "matrix");
	}
}