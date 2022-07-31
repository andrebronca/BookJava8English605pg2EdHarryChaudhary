package j002.cap12;

public class A3 extends Thread{
	A3(){
		super("Test Thread");
		System.out.println("Child thread: "+ this);
		start();
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Child Thread: "+ i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Child thread interrupted");
			}
		}
		System.out.println("Exiting Child thread");
	}
}

class ThreadTest{
	public static void main(String[] args) {
		new A3();
		for(int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
		}
		System.out.println("Main thread exiting");
	}
}