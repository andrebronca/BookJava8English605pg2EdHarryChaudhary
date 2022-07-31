package j002.cap12.exemplo12p16;

//example 12.16
public class A implements Runnable {

	String name;
	Thread t;
	
	public A(String nameThread) {
		name = nameThread;
		t = new Thread(this, name);
		System.out.println("Child Thread: "+ t);
		t.start();
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(name +":"+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(name +" exiting");
	}

}

class SuspendResume{
	public static void main(String[] args) {
		A ob1 = new A("one");
		A ob2 = new A("two");
		try {
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Suspending Thread one");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("Resuming Thread one");
			ob2.t.suspend();
			System.out.println("Suspending Thread two");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("Resuming Thread two");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}