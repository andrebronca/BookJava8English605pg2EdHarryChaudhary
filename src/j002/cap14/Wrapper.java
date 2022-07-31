package j002.cap14;

//example 14.1
public class Wrapper {
	public static void main(String[] args) {
		Integer iObj = new Integer(128);
		System.out.println(iObj.byteValue()); //truncation
		
		Long lObj = new Long(123456789123456789L);
		System.out.println(lObj);
		System.out.println(lObj.doubleValue());
		
		Float fObj = new Float(3.99f);
		System.out.println(fObj.intValue()); //truncation
	}
}
