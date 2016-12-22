class Lab241
{
	public static void main(String[] args)
	{
		Hello4 h = new Hello4();
		System.out.println("Main: "+h.a);
	}
}
class Hello4
{
	int a;
	{
		a = 10;
		System.out.println("Initialized: "+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab241.java

E:\JLC OOPs Lab>java Lab241
Initialized: 10
Main: 10
*/