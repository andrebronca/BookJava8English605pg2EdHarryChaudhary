package j002.cap05;

public class A7 {
	private int x;
	private int y;
	
	A7(){			//zero argumento constructor
		this(0);	//chamando um construtor de dentro de um construtor
//		x = y = 0;
	}
	
	A7(int x1){		//parameterized one argumento constructor
		x = y = x1;
	}
	
	A7(int x1, int y1){
		x = x1;
		y = y1;
	}
	
	void display() {
		System.out.println(x +"\t"+ y);
	}
}

class ClassTest7{
	public static void main(String[] args) {
		A7 a = new A7();
		a.display();
		A7 b = new A7(5);
		b.display();
		A7 c = new A7(4, 7);
		c.display();
	}
}