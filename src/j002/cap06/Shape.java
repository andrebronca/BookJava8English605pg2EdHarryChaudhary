package j002.cap06;

//exemplo 6.5
public class Shape {
	void getData() {
		System.out.println("getData() of Shape");
	}

	void area() {
		System.out.println("area() of Shape");
	}

	void display() {
		System.out.println("display() of Shape");
	}
}

class Circle extends Shape {
	void getData() {
		System.out.println("getData() of Circle");
	}

	void area() {
		System.out.println("area() of Circle");
	}

	void display() {
		System.out.println("display() of Circle");
	}
}

class Rectangle extends Shape {
	void getData() {
		System.out.println("getData() of Rectangle");
	}

	void area() {
		System.out.println("area() of Rectangle");
	}

	void display() {
		System.out.println("display() of Rectangle");
	}
}

class InheritTest5 {
	public static void main(String[] args) {
		// super reference variable can accept sub class object
		// dynamic binding
		Shape s[] = { new Circle(), new Rectangle() };

		for (int i = 0; i < s.length; i++) {
			s[i].getData();
			s[i].area();
			s[i].display();
		}
	}
}