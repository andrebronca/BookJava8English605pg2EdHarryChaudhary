package j002.cap12.exemplo12p15;

public class A {
	synchronized void foo(B b1) {
		System.out.println("Method foo called an then blocked");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Trying to call b1.last()");
		b1.last();
	}

	synchronized void last() {
		System.out.println("This will not be printed");
	}
}

class B {
	synchronized void bar(A a1) {
		System.out.println("Method bar called and then blocked");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Trying to call a1.last()");
		a1.last();
	}

	synchronized void last() {
		System.out.println("this will not be printed");
	}
}

class DeadLock implements Runnable {

	A a1 = new A();
	B b1 = new B();

	public DeadLock() {
		Thread t = new Thread(this);
		t.start();
		a1.foo(b1);
	}

	@Override
	public void run() {
		b1.bar(a1);
	}
	
	public static void main(String[] args) {
		new DeadLock();
	}

}