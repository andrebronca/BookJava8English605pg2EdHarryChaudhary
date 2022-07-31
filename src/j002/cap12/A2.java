package j002.cap12;

public class A2 implements Runnable{

	Thread t;
	A2(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: "+ t);
		t.start();
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Child Thread: "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Exiting Child thread");
	}
}

class RunnableTest2{
	public static void main(String[] args) {
		A2 a1 = new A2();
		for(int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: "+ i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("main thread interrupted");
			}
		}
		System.out.println("End of Main thread");
	}
}
