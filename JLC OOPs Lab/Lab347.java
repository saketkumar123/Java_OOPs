class Lab347
{
	public static void main(String[] args)
	{
		new B(10);
	}
}
class A
{
	A()
	{
		System.out.println("A (int) cons");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B -> D.C.");
	}
	B(int a)
	{
		this();
		System.out.println("B -> (int) Cons");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab347.java

E:\JLC OOPs Lab>java Lab347
A (int) cons
B -> D.C.
B -> (int) Cons
*/