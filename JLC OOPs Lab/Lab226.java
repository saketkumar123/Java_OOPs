class Lab226
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
		System.out.println(h.a);
		h.a = 99;
		System.out.println(h.a);
	}
}
class Hello
{
	int a;
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab226.java

E:\JLC OOPs Lab>java Lab226
0
99
*/