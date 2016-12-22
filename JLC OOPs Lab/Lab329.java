class Lab329
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.m1();
		bobj.m2();

		C cobj = new C();
		cobj.m1();
		cobj.m3();
	}
}
class A
{
	void m1()
	{
		System.out.println("A -> m1");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("B -> m2");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("C -> m3");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab329.java

E:\JLC OOPs Lab>java Lab329
A -> m1
B -> m2
A -> m1
C -> m3
*/