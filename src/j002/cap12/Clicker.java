package j002.cap12;

//example 12.7
public class Clicker implements Runnable {

	long click = 0;
	Thread t;
	volatile boolean running = true;
	/*
	 * Low : 4285954170
High: 4299512712
	 */
	
	public Clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}
	
	@Override
	public void run() {
		while(running) {
			click++;
		}
	}
	
	void stop() {
		running = false;
	}
	
	void start() {
		t.start();
	}
}

class HiLoPri{
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 1);
		Clicker lo = new Clicker(Thread.NORM_PRIORITY - 1);
		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		lo.stop();
		hi.stop();
		
		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Low : "+ lo.click);
		System.out.println("High: "+ hi.click);
	}
}