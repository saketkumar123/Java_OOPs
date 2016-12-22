interface Inter1
{
	void show();
}
class A
{
	public void show()
	{
		System.out.println("A -> show()");
	}
}
class B extends A implements Inter1{}
class Lab421
{
	public static void main(String[] args)
	{
		B ref = new B();
		ref.show();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab421.java

E:\JLC OOPs Lab>java Lab421
A -> show()
*/