package j002.cap20;

public class TestShallowClone implements Cloneable{
	int a;
	float b;
	int c[];
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ShallowCloneDemo{
	public static void main(String[] args) throws CloneNotSupportedException {
		TestShallowClone tc1 = new TestShallowClone();
		TestShallowClone tc2;
		tc1.a = 8;
		tc1.b = 4.5f;
		int c[] = new int[4];
		for(int i = 0; i < 4; i++) {
			c[i] = i;
		}
		tc1.c = c;
		for(int i = 0; i < 4; i++) {
			System.out.println("tc1.c["+ i +"] = "+ tc1.c[i]);
		}
		tc2 = (TestShallowClone) tc1.clone();
		System.out.println("tc2.a "+ tc2.a);
		System.out.println("tc2.b "+ tc2.b);
		for(int i = 0; i < 4; i++) {
			System.out.println("tc2.c["+ i +"] = "+ tc2.c[i]);
		}
		for(int i = 0; i < 4; i++) {
			tc2.c[i] = i + 4;
		}
		for(int i = 0; i < 4; i++) {
			System.out.println("tc2.c["+ i +"] = "+ tc2.c[i]);
		}
		for(int i = 0; i < 4; i++) {
			System.out.println("tc1.c["+ i +"] = "+ tc1.c[i]);
		}
	}
}