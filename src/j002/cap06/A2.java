package j002.cap06;

//exemplo 6.2
public class A2 {
	int x;
	
	void set(int x1) {
		x = x1;
	}
	
	void display() {
		System.out.println(x);
	}
}

class B2 extends A2{
	int y;
	
	//não sobrescreve o método da superclasse por ter assinatura diferente
	void set(int x1, int y1) {
		set(x1);	//chama o método da superclasse
		y = y1;
	}
	
	//sobrescreve o método da superclasse
	void display() {
		//display(); chama o método dessa classe
		super.display(); //chama o método da superclasse
		System.out.println(y);
	}
}

class InheritTest2{
	public static void main(String[] args) {
		B2 b1 = new B2();
		b1.set(10, 20);
		b1.display();
	}
}
