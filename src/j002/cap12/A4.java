package j002.cap12;

public class A4 implements Runnable{

	String name;
	Thread t;
	
	A4(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Child thread: "+ t);
		t.start();
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(t.getName() +":"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(name + " exiting");
	}
}

class MultiThreadTest{
	public static void main(String[] args) {
		A4 a1 = new A4("one");
		A4 a2 = new A4("two");
		A4 a3 = new A4("Three");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
