class Lab374
{
	public static void main(String[] args)
	{
		B b = new B();
		b.SHOW();
		b.show();
	}
}
class A
{
	void show()
	{
		System.out.println("A -> show()");
	}
}
class B extends A
{
	void SHOW()
	{
		System.out.println("B -> SHOW()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab374.java

E:\JLC OOPs Lab>java Lab374
B -> SHOW()
A -> show()
*/