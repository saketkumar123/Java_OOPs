class Lab252
{
	public static void main(String[] args)
	{

	}
}
class Hello10
{
	static int a;
	static
	{
		static int b;
		System.out.println(a);
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab252.java
Lab252.java:13: error: illegal start of expression
                static int b;
                ^
1 error
*/