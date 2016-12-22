class Lab325
{
	public static void main(String[] args)
	{
		Hai h1 = new Hai();
		System.out.println(h1.a);

		Hello55 h2 = new Hello55();
		System.out.println(h2.a);
		System.out.println(h2.b); 
	}
}
class Hai
{
	int a = 99;
}
class Hello55 extends Hai
{
	int b = 88;
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab325.java

E:\JLC OOPs Lab>java Lab325
99
99
88
*/