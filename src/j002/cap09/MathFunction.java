package j002.cap09;

public interface MathFunction {
	abstract void display(int x);
}

class Sqrt implements MathFunction {
	@Override
	public void display(int x) {
		System.out.println("sqrt of "+ x +" = "+ Math.sqrt(x));
	}
}

class Log implements MathFunction{
	@Override
	public void display(int x) {
		System.out.println("log of "+ x +" = "+ Math.log(x));
	}
}

class MathDemo {
	public static void main(String[] args) {
		MathFunction f1 = new Sqrt();
		MathFunction f2 = new Log();
		f1.display(27);
		f2.display(3);
		
		MathFunction f3;
		f3 = f1; 	//polymorfismo (atribuição de referência)
		f3.display(30);
		
		f3 = f2;
		f3.display(5);
	}
}