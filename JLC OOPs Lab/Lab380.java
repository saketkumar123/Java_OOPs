class Lab380
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.m1();
	}
}
class A
{
	final void m1()
	{
		System.out.println("goo");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("good");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab380.java
Lab380.java:18: error: m1() in B cannot override m1() in A
        void m1()
             ^
  overridden method is final
  */
1 error