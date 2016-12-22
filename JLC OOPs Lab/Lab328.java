class Lab328
{
	public static void main(String[] args)
	{
		C cobj = new C();
		cobj.m1();
		cobj.m2();
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
class C extends B
{
	void m3()
	{
		System.out.println("C -> m3");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab328.java

E:\JLC OOPs Lab>java Lab328
A -> m1
B -> m2
C -> m3
*/