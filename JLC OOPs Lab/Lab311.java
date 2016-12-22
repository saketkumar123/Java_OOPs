class Lab311
{
	public static void main(String[] args)
	{
		Hello48 h = new Hello48();
		h.sum(12,23);
		h.sum(12,32,43);
	}
}
class Hello48
{
	void sum(int a,int b)
	{
		System.out.println("--sum(int,int)");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println("--sum(int,int,int)");
		System.out.println(a+b+c);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab311.java

E:\JLC OOPs Lab>java Lab311
--sum(int,int)
35
--sum(int,int,int)
87
*/