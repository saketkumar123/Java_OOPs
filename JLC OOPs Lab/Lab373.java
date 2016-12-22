class Lab373
{
	public static void main(String[] args)
	{
		Hai h = new Hai();
		h.m1();
		h.m2();
		h.m3();
	}
}
class Hello
{
	void m1()
	{
		System.out.println("Hello -> m1()");
	}
	void m2()
	{
		System.out.println("Hello -> m2()");
	}
}
class Hai extends Hello
{
	void m2()
	{
		System.out.println("Hai -> m2()");
	}
	void m3()
	{
		System.out.println("Hai -> m3()");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab373.java

E:\JLC OOPs Lab>java Lab373
Hello -> m1()
Hai -> m2()
Hai -> m3()
*/