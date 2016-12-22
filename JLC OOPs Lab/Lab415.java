interface Inter1
{
	void m1();
	public abstract void m2();
	int A = 10;
	public  final int B = 20;
}
abstract class Hello implements Inter1
{
	public void m1()
	{
		System.out.println("Hello -> m1(): "+A);
	}
}
class Hai extends Hello
{
	public void m2()
	{
		System.out.println("Hai -> m2(): "+B);
	}
	void m3()
	{
		System.out.println("Hai -> m3()");
	}
}
class Lab415
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");
		Inter1 ref = null;
		//ref = new Inter1();
		ref = new Hai();
		ref.m1();
		ref.m2();
		//ref.m3();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab415.java

E:\JLC OOPs Lab>java Lab415
Main Started
Hello -> m1(): 10
Hai -> m2(): 20
*/