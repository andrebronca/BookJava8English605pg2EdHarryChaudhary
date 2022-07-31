package j002.cap11;

import java.io.IOException;

public class ErrorTest11 {
	int age;
	void setAge(int a) throws IOException {
		if (a > 0) {
			age = a;
		} else {
			throw new IOException("Invalid Age");
		}
	}
	
	public static void main(String[] args) {
		ErrorTest11 a1 = new ErrorTest11();
		try {
			a1.setAge(20);
			a1.setAge(-10);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
