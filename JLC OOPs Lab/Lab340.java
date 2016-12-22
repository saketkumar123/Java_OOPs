class Lab340
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
	static
	{
		System.out.println("A-> S.B.");
	}
	{
		System.out.println("A-> I.B.");
	}
}

class B extends A
{
	B()
	{
		System.out.println("B-> D.C.");
	}
	static
	{
		System.out.println("B-> S.B.");
	}
	{
		System.out.println("B-> I.B.");
	}
}

class C extends B
{
	C()
	{
		System.out.println("C-> D.C.");
	}
	static
	{
		System.out.println("C-> S.B.");
	}
	{
		System.out.println("C-> I.B.");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab340.java

E:\JLC OOPs Lab>java Lab340
A-> S.B.
B-> S.B.
C-> S.B.
A-> I.B.
A-> D.C.
B-> I.B.
B-> D.C.
C-> I.B.
C-> D.C.
*/