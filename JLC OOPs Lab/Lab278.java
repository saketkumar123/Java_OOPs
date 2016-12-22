class Lab278
{
	public static void main(String[] args)
	{
		Hello23 h = new Hello23();
		h.show();
	}
}
class Hello23
{
	static int b;
	static void show()
	{
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab278.java

E:\JLC OOPs Lab>java Lab278
0
*/