interface Inter1
{
	void m1();
	public abstract void m2();
	int A = 10;
	public  final int B = 20;
}
abstract class Hello implements Inter1{}
class Lab412
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys!");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab412.java

E:\JLC OOPs Lab>java Lab412
Hello Guys!
*/