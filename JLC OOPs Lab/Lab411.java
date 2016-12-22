interface Inter1
{
	void m1();
	public abstract void m2();
	int A = 10;
	public  final int B = 20;
}
class Hello implements Inter1{}
class Lab411
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys!");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab411.java
Lab411.java:8: error: Hello is not abstract and does not override abstract method m2() in Inter1
class Hello implements Inter1{}
^
1 error
*/