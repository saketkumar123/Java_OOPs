class Lab242
{
	public static void main(String[] args)
	{
		System.out.println("Main: "+Hello5.a);
	}
}
class Hello5
{
	static int a;
	{
		a = 10;
		System.out.println("Initialized: "+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab242.java

E:\JLC OOPs Lab>java Lab242
Main: 0
*/