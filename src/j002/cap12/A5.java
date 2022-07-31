package j002.cap12;

//exemplo 12.6
public class A5 implements Runnable {

	String name;
	Thread t;
	
	public A5(String threadName) {
		name  = threadName;
		t = new Thread(this, name);
		System.out.println("Child thread: "+ t);
		t.start();
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(name +":"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(name + " exiting");
	}
}

class DemoJoin{
	public static void main(String[] args) {
		A5 ob1 = new A5("one");
		A5 ob2 = new A5("two");
		A5 ob3 = new A5("three");
		
		System.out.println("Thread "+ ob1.t.getName() +" is alive? : "+ ob1.t.isAlive());
		System.out.println("Thread "+ ob2.name +" is alive? : "+ ob2.t.isAlive());
		System.out.println("Thread "+ ob3.name +" is alive? : "+ ob3.t.isAlive());
		
		try {
			ob3.t.join();
			ob2.t.join();
			ob1.t.join();
			
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("Thread "+ ob1.name +" is alive? : "+ ob1.t.isAlive());
		System.out.println("Thread "+ ob2.name +" is alive? : "+ ob2.t.isAlive());
		System.out.println("Thread "+ ob3.name +" is alive? : "+ ob3.t.isAlive());
		System.out.println("Main thread exiting");
	}
}