package j002.cap09;

//por padrão interfaces são abstracts
public interface Interface_1 {
	static final int CODE = 1001;	//padrao de variáveis: public static final
	static final String NAME = "Matrix";
	abstract void show(int x);	//métodos devem ser como abstract
}

class Class1 implements Interface_1{
	@Override
	public void show(int x) {
		System.out.println(Interface_1.CODE +", "+ Interface_1.NAME);
	}
}
