package j002.cap14;

//example 14.5
public class StringToNumericObjectDemo {
	public static void main(String[] args) {
		String str = "30";
		String str2 = "30.333";
		Byte bObj = Byte.valueOf(str);
		System.out.println(bObj);
		
		//Byte bObj1 = new Byte(str2);	//numberformatexception
		
		Short sObj = Short.valueOf(str);
		System.out.println(sObj);
		
		Integer iObj = Integer.valueOf(str);
		System.out.println(iObj);
		
		Long lObj = Long.valueOf("344324232432");
		System.out.println(lObj);
		
		Float fObj = Float.valueOf("3.333");
		System.out.println(fObj);
		
		Double dObj = Double.valueOf(str2);
		System.out.println(dObj);
	}
}
