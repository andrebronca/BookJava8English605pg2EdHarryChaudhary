package j002.cap14;

//example 14.3
public class ConvertPrimitiveToString {
	public static void main(String[] args) {
		System.out.println("Convert primitive numbers to String "
				+ "using toString() static method of corresponding wrapper class");
		
		byte b = 105;
		String str = Byte.toString(b);
		System.out.println(str);
		
		short s = 303;
		str = Short.toString(s);
		System.out.println(str);
		
		int i = 100;
		str = Integer.toString(i);
		System.out.println(str);
		
		long l = 45444444444444L;
		str = Long.toString(l);
		System.out.println(str);
		
		float f = 3.444f;
		str = Float.toString(f);
		System.out.println(str);
		
		double d = 3.444444;
		str = Double.toString(d);
		System.out.println(str);
	}
}
