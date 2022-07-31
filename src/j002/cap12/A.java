package j002.cap12;

public class A  implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Child Thread: "+ i);
		}
		System.out.println("Exiting child thread");
	}
}

class RunnableTest{
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1, "Demo Thread");
		t1.start();
		System.out.println("Main thread exiting");
	}
}