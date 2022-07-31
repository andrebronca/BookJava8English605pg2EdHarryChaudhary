package j002.cap12.exemplo12p13;

/*
 * aplicando correção para sincronizar toda a classe
 * evitar o erro de chamar várias vezes o mesmo valor.
 */
public class Q {
	int n;
	//implementando correção
	boolean valueSet = false;
	
	synchronized int get() {
		//correção
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Got :"+ n);
		valueSet = false;	//correção
		notify();			//correção
		return n;
	}
	
	synchronized void put(int n) {
		//correção
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		this.n = n;
		valueSet = true;	//correção
		System.out.println("Put :"+ n);
		notify();	//correção
	}
}

class Producer implements Runnable{

	Q q1;
	public Producer(Q q2) {
		q1 = q2;
		new Thread(this, "Producer").start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			q1.put(++i);
		}
	}
}

class Consumer implements Runnable{
	Q q1;
	
	public Consumer(Q q2) {
		q1 = q2;
		new Thread(this, "Consumer").start();
	}
	
	@Override
	public void run() {
		while(true) {
			q1.get();
		}
	}
}

class PC {
	public static void main(String[] args) {
		Q q1 = new Q();
		new Producer(q1);
		new Consumer(q1);
		System.out.println("Press Control-C to stop");
	}
}