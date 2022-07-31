package j002.cap23;

//not functional, because equals is already an
//implicit member Object class
public interface Foo {
	boolean equals(Object obj);
}


//Functional because Comparator has only one abstract
//non-Object method
interface Comparator<T>{
	boolean equals(Object obj);
	int compare(T o1, T o2);
}

//Not function because method Object.clone is not public
interface Foo2 {
	int m();
	Object clone();
}

//Functional: two methods, but they have the same signature
interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<String> arg); }
interface Z extends X, Y {}

//Functional Y2.m is a subsignature & retury-type-substitutable
interface X2 { Iterable m(Iterable<String> arg); }
interface Y2 { Iterable<String> m (Iterable arg); }
interface Z2 extends X2, Y2 {};

/*
Leitura paralizada na página 583 de 605.
Muito simplista e confusa a explicação, mal organizada.
Lendo só por ler.
Obs. O livro teve boas explicações, mas teve muitos erros ortográficos
e repetição de explicação.
*/