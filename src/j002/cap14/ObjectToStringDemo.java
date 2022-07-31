package j002.cap14;

//example 14.4
public class ObjectToStringDemo {
	public static void main(String[] args) {
		System.out.println("Convert object numbers to String "
				+ "using toString() method of corresponding wrapper class");
		
		byte b = 105;
		Byte bObj = new Byte(b);
		String str = bObj.toString();
		System.out.println(str);
		
		short s = 203;
		Short sObj = new Short(s);
		str = sObj.toString();
		System.out.println(str);
		
		Integer iObj = new Integer(32000);
		str = iObj.toString();
		System.out.println(str);
		
		str = new Long(454444444444l).toString();
		System.out.println(str);
		
		str = new Float(3.1444f).toString();
		System.out.println(str);
		
		str = new Double(4.14444).toString();
		System.out.println(str);
		
	}
}
