interface Inter1
{
	void m1();
	public abstract void m2();
	int A = 10;
	public  final int B = 20;
}
class Hello implements Inter1
{
	void m1()
	{
		System.out.println("Hello -> m1()");
	}
	public void m2()
	{
		System.out.println("Hello -> m2()");
	}
}
class Lab413
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys!");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab413.java
Lab413.java:10: error: m1() in Hello cannot implement m1() in Inter1
        void m1()
             ^
  attempting to assign weaker access privileges; was public
1 error
*/