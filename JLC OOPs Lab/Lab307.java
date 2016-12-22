class Lab307
{
	public static void main(String[] args)
	{
		int a = 99;
		Hello44 h = new Hello44();
		System.out.println("main begin: "+a);
		h.m1(a);
		System.out.println("main ends: "+a);

	}
}
class Hello44
{
	void m1(int a)
	{
		System.out.println("m1 begin: "+a);
		a = a+10;
		System.out.println("m1 ends: "+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab307.java

E:\JLC OOPs Lab>java Lab307
main begin: 99
m1 begin: 99
m1 ends: 109
main ends: 99
*/