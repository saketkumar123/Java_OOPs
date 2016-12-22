class Lab339
{
	public static void main(String[] args)
	{
		new C();
	}
}

class A
{
	A()
	{
		System.out.println("A-> D.C.");
	}
}

class B extends A
{
	B()
	{
		System.out.println("B-> D.C.");
	}
}

class C extends B
{
	C()
	{
		System.out.println("C-> D.C.");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab339.java

E:\JLC OOPs Lab>java Lab339
A-> D.C.
B-> D.C.
C-> D.C.
*/