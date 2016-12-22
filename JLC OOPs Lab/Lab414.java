interface Inter1
{
	void m1();
	public abstract void m2();
	int A = 10;
	public  final int B = 20;
}
class Hello implements Inter1
{
	public void m1()
	{
		System.out.println("Hello -> m1(): "+A);
	}
	public void m2()
	{
		System.out.println("Hello -> m2(): "+B);
	}
}
class Lab414
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");
		Inter1 ref = null;
		//ref = new Inter1();
		ref = new Hello();
		ref.m1();
		ref.m2();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab414.java

E:\JLC OOPs Lab>java Lab414
Main Started
Hello -> m1(): 10
Hello -> m2(): 20
*/