package j002.cap05;

//exemple 5.13
public class Box {
	private int feet;
	private int inches;
	
	Box(){
		feet = inches = 0;
	}
	
	//passagem por valor
	Box(int feet, int inches){
		this.feet = feet;
		this.inches = inches;
	}
	
	void display() {
		System.out.println("Feet is "+ feet +"\n"+"Inches is "+ inches);
	}
	
	//passagem por referência.
	void swap(Box obj) {
		int t;
		t = feet;
		feet = obj.feet;
		obj.feet = t;
		t = inches;
		inches = obj.inches;
		obj.inches = t;
	}
}

class ClassTest12{
	public static void main(String[] args) {
		Box b1 = new Box(5,6);
		Box b2 = new Box(7,4);
		b1.swap(b2);
		b1.display();
		b2.display();
	}
}
