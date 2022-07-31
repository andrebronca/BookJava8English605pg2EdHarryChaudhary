package j002.cap14;

//example 14.6
public class StringToNumericObjectDemo1 {
	public static void main(String[] args) {
		String str = new String("30");
		//String str = "30";
		String str2 = new String("30.333");
		Byte bObj = new Byte(str);
		System.out.println(bObj);
		//Byte bObj = new Byte(str2);	//NumberFormatException
		
		Short sObj = new Short(str);
		System.out.println(sObj);
		
		Integer iObj = new Integer(str);
		System.out.println(iObj);
		
		Long lObj = new Long(str);
		System.out.println(lObj);
		
		Float fObj = new Float(str);
		System.out.println(fObj);
		
		Double dObj = new Double(str);
		System.out.println(dObj);
	}
}
