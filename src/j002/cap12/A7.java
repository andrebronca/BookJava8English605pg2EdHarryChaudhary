package j002.cap12;

//example 12.8
public class A7 {
	void display(String msg) {
		System.out.print("["+ msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
	}
}

class B2 implements Runnable{

	A7 obj;
	String msg;
	Thread t;
	
	public B2(A7 obj1, String m) {
		msg = m;
		obj = obj1;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		//forma de sincronizar quando não é 
		//possível alterar o fonte do objeto alvo
		synchronized (obj) {
			obj.display(msg);
		}
	}
}

class Synch3{
	public static void main(String[] args) {
		A7 a1 = new A7();
		B2 b1 = new B2(a1, "hello");
		B2 b2 = new B2(a1, "world");
		B2 b3 = new B2(a1, "matrix");
	}
}