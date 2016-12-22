class Lab392
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.m1();
	}
}
class A
{
	static void m1()
	{
		System.out.println("A -> m1()");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("B -> m1()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab392.java

E:\JLC OOPs Lab>java Lab392
B -> m1()
*/