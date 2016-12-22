class Lab390
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.m1();
	}
}
class A
{
	void m1()
	{
		System.out.println("A -> m1()");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("B -> m1()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab390.java

E:\JLC OOPs Lab>java Lab390
B -> m1()
*/