interface Inter1
{
	void m1();
	public abstract void m2();
	int A = 10;
	public  final int B = 20;
}
class Hello extends Inter1{}
class Lab410
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab410.java
Lab410.java:8: error: no interface expected here
class Hello extends Inter1{}
                    ^
1 error
*/