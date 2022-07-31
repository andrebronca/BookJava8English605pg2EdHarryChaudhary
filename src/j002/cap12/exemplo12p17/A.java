package j002.cap12.exemplo12p17;

//example 12.17
public class A implements Runnable{
	String name;
	Thread t;
	boolean suspendFlag;
	
	public A(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Child Thread: "+ t);
		suspendFlag = false;
		t.start();
	}
	
	void mySuspend() {
		suspendFlag = true;
	}
	
	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
	

	@Override
	public void run() {
		for(int i = 1; i <= 15; i++) {
			System.out.println(name +":"+ i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			synchronized (this) {
				if(suspendFlag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println(name +" exiting");
	}
}

class SuspendResume1{
	public static void main(String[] args) {
		A ob1 = new A("one");
		A ob2 = new A("two");
		try {
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Suspending Thread one");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println("Resuming Thread one");
			ob2.mySuspend();
			System.out.println("Suspending Thread two");
			Thread.sleep(1000);
			ob2.myResume();
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
		System.out.println("main exiting");
	}
}