class Lab310
{
	public static void main(String[] args)
	{
		Hello47 h = new Hello47();
		h.sum(12,23);
	}
}
class Hello47
{
	void sum(int a,int b)
	{
		System.out.println("--sum(int,int)");
		System.out.println(a+b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab310.java

E:\JLC OOPs Lab>java Lab310
--sum(int,int)
35
*/