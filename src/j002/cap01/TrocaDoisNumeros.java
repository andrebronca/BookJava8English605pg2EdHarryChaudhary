package j002.cap01;

public class TrocaDoisNumeros {

	/**
	 * Troca os números usando apenas duas variáveis
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		System.out.println("a: "+ a +", b: "+ b);
		
		a += b; 
		b = a - b; 
		a -= b; 
		
		System.out.println("a: "+ a + ", b: "+ b);
		
	}

}
