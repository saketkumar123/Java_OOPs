class Lab375
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.show(99);
		bobj.show("JLC");
	}
}
class A
{
	void show(int ab)
	{
		System.out.println("A -> show(int)");
	}
}
class B extends A
{
	void show(String ab)
	{
		System.out.println("B -> show(String)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab375.java

E:\JLC OOPs Lab>java Lab375
A -> show(int)
B -> show(String)
*/