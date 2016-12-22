class Lab232
{
	public static void main(String[] args)
	{
		Hello1 h = new Hello1();
		System.out.println(h.b);
		h.b = 99;
		System.out.println(h.b);
	}
}
class Hello1
{
	static int b;
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab232.java

E:\JLC OOPs Lab>java Lab232
0
99
*/