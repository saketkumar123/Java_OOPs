class Lab338
{
	public static void main(String[] args)
	{
		new B();
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

/*
Output
======

E:\JLC OOPs Lab>javac Lab338.java

E:\JLC OOPs Lab>java Lab338
A-> D.C.
B-> D.C.
*/