package j002.cap09;

public interface Common {
	static final int NUM = 1;

	abstract void push(int x);
	abstract int pop();
}

//parcial implementação declarada como abstract
//não precisa implementar os métodos da interface
abstract class stack implements Common{
	void disp() {
		
	}
}
