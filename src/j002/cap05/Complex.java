package j002.cap05;

import java.util.Scanner;

public class Complex {
	private int real, imag;
	
	public Complex() {
		real = imag = 0;
	}
	
	Complex(int real, int imag){
		this.real = real;
		this.imag = imag;
	}
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real ");
		real = sc.nextInt();
		System.out.print("Enter imag ");
		imag = sc.nextInt();
	}
	
	void display() {
		if (imag > 0) {
			System.out.println(real +"+"+ imag +"i");
		} else {
			System.out.println(real +""+ imag +"i");
		}		
	}
	
	Complex sum(Complex c) {
		Complex t = new Complex();
		t.real = real + c.real;
		t.imag = imag + c.imag;
		return t;
		//or
//		return new Complex(real + c.real, imag + c.imag);
	}
	
	Complex mult(Complex c) {
		Complex t = new Complex();
		t.real = real * c.real - imag * c.imag;
		t.imag = real * c.imag + imag * c.real;
		return t;
	}
	
	public static void main(String[] args) {
		Complex a = new Complex();
		Complex b = new Complex();
		Complex c = null, d = null;
		
		a.getData();
		b.getData();
		c = a.sum(b);
		System.out.print("Sum is ");
		c.display();
		d = a.mult(b);
		System.out.print("Product is ");
		d.display();
	}
}
