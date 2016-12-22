class Lab345
{
	public static void main(String[] args)
	{
		new B();
	}
}
class A
{
	A(int a)
	{
		System.out.println("A (int) cons");
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("B -> D.C.");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab345.java

E:\JLC OOPs Lab>java Lab345
A (int) cons
B -> D.C.
*/