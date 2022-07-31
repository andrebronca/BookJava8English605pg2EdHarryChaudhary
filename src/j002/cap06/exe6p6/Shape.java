package j002.cap06.exe6p6;

abstract class Shape {
	abstract void getData();
	abstract void area();
	abstract void display();
}

class Circle extends Shape{

	@Override
	void getData() {
		System.out.println("getData() of Circle");
	}

	@Override
	void area() {
		System.out.println("area() of Circle");
	}

	@Override
	void display() {
		System.out.println("display() of Circle");
	}
}

class Rectangle extends Shape{

	@Override
	void getData() {
		System.out.println("getData() of Rectangle");
	}

	@Override
	void area() {
		System.out.println("area() of Rectangle");
	}

	@Override
	void display() {
		System.out.println("display() of Rectangle");
	}
}

class InheritTest6{
	public static void main(String[] args) {
		//super reference variable can accept sub class object
		//dynamic binding
		Shape s[] = { new Circle(), new Rectangle() };
		
		for(int i = 0; i < s.length; i++) {
			s[i].getData();
			s[i].area();
			s[i].display();
		}
	}
}