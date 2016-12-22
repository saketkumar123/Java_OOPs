class Lab276
{
	public static void main(String[] args)
	{
		Hello21 h = new Hello21();
		h.show();
	}
}
class Hello21
{
	int a;
	static int b;
	void show()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab276.java

E:\JLC OOPs Lab>java Lab276
0
0
*/