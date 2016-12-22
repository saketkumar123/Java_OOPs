class Lab346
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
		System.out.println("B -> D.C.");
		super(10);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab346.java
Lab346.java:18: error: constructor A in class A cannot be applied to given types;
        {
        ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Lab346.java:20: error: call to super must be first statement in constructor
                super(10);
                     ^
2 errors
*/