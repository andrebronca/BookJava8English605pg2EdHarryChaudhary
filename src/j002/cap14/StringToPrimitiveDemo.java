package j002.cap14;

//example 14.7
public class StringToPrimitiveDemo {
	public static void main(String[] args) {
		String str = new String("30");
		String str2 = new String("30.333");
		byte b = Byte.parseByte(str);
		System.out.println(b);
		
		short s = Short.parseShort(str);
		System.out.println(s);
		
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		long l = Long.parseLong(str);
		System.out.println(l);
		
		float f = Float.parseFloat(str2);
		System.out.println(f);
		
		double d = Double.parseDouble(str2);
		System.out.println(d);
	}
}
