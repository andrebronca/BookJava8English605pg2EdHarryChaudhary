package j002.cap12;

//example 12.8
public class A6 {
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

class B implements Runnable{

	A6 obj;
	String msg;
	Thread t;
	
	public B(A6 obj1, String m) {
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

class Synch1{
	public static void main(String[] args) {
		A6 a1 = new A6();
		B b1 = new B(a1, "hello");
		B b2 = new B(a1, "world");
		B b3 = new B(a1, "matrix");
	}
}