class Lab297
{
	public static void main(String[] args)
	{
		Hello36 h = new Hello36();
		int a = h.add(10,20);
		System.out.println(a);
		int b = h.add(10,20,30);
		System.out.println(b);
	}
}
class Hello36
{
	int add(int a,int b)
	{
		System.out.println("add(int,int)");
		return a+b;
	}
	int add(int a,int b,int c)
	{
		System.out.println("add(int,int)");
		return a+b+c;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab297.java

E:\JLC OOPs Lab>java Lab297
add(int,int)
30
add(int,int)
60
*/