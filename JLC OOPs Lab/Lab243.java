class Lab243
{
	public static void main(String[] args)
	{
		System.out.println("Main: "+Hello6.a);
	}
}
class Hello6
{
	static int a;
	static
	{
		a = 10;
		System.out.println("Initialized: "+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>java Lab243
Initialized: 10
Main: 10
*/