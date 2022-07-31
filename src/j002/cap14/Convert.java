package j002.cap14;

//example 14.2
public class Convert {
	public static void main(String[] args) {
		byte b = 105;
		Byte bObj = new Byte(b);
		System.out.println(bObj);
		
		short s = 2015;
		Short sObj = new Short(s);
		System.out.println(sObj);
		
		int i = 32717;
		Integer iObj = new Integer(i);
		System.out.println(iObj);
		
		long l = 234543335567675L;
		Long lObj = new Long(l);
		System.out.println(lObj);
		
		float f = 3.1415f;
		Float fObj = new Float(f);
		System.out.println(fObj);
		
		double d = 3.1415;
		Double dObj = new Double(d);
		System.out.println(dObj);
		
		int i1 = iObj.intValue();
		byte b1 = bObj.byteValue();
		long l1 = lObj.longValue();
		short s1 = sObj.shortValue();
		float f1 = fObj.floatValue();
		double d1 = dObj.doubleValue();
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
	}
}
