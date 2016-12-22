class Lab344
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
		super();
		System.out.println("B -> D.C.");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab344.java
Lab344.java:19: error: constructor A in class A cannot be applied to given types;
                super();
                ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/