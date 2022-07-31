package j002.cap09;

public interface Static_Var {
	int sun = 1;
	int mon = 2;
	int tues = 3;
	int wed = 4;
	int thurs = 5;
	int fri = 6;
	int sat = 7;
}

class Week_Day implements Static_Var{
	public static void main(String[] args) {
		System.out.println(sun);
		System.out.println(mon);
		System.out.println(tues);
		System.out.println(wed);
		System.out.println(thurs);
		System.out.println(fri);
		System.out.println(sat);
		//or
		//caso a classe não implementa a interface
		System.out.println(Static_Var.sun);
	}
}
