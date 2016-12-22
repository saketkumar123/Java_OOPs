class Hello implements Inter1,Inter2
{
	public void m1()
	{
		System.out.println("Hello -> m1()");
	}
	public void m2()
	{
		System.out.println("Hello -> m2()");
	}
	public void m3()
	{
		System.out.println("Hello -> m3()");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}
}
class Lab418
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
		h.m1();
		h.m2();
		h.m3();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab418.java
Lab418.java:14: error: reference to A is ambiguous
                System.out.println(A);
                                   ^
  both variable A in Inter1 and variable A in Inter2 match
1 error
*/