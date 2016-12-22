class Lab382
{
	public static void main(String[] args)
	{
		//B bobj = new B();
		B.m1();
	}
}
class A
{
	void m1()
	{
		System.out.println("m1 -> A");
	}
	static void m2()
	{
		System.out.println("static m2 -> A");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("m1 -> B");
	}
	static void m2()
	{
		System.out.println("static m2 -> B");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab382.java
Lab382.java:6: error: non-static method m1() cannot be referenced from a static context
                B.m1();
                 ^
1 error
*/