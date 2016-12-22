class Lab327
{
	public static void main(String[] args)
	{
		Hello56 h1 = new Hello56();
		h1.m1();
		h1.m2();
		
	}
}
class Hai
{
	int a = 99;
	void m1()
	{
		System.out.println("Hai -> m1: "+a);
	}
}
class Hello56 extends Hai
{
	int b = 88;
	void m2()
	{
		System.out.println("Hai -> m2: "+a);
		System.out.println("Hai -> m2: "+b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab327.java

E:\JLC OOPs Lab>java Lab327
Hai -> m1: 99
Hai -> m2: 99
Hai -> m2: 88
*/