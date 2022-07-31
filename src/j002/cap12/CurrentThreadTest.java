package j002.cap12;

public class CurrentThreadTest {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+ t);
		System.out.println("Name: "+ t.getName());
		System.out.println("Priority: "+ t.getPriority());
		t.setName("MyThread");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("After name and priority change: "+ t);
		System.out.println("Name: "+ t.getName());
		System.out.println("Priority: "+ t.getPriority());
		
		for(int n = 1; n <= 5; n++) {
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main Thread interrupted");
			}
		}
	}
}
