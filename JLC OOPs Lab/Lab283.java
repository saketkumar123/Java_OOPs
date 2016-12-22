class Lab283
{
	public static void main(String[] args)
	{
		Hello23 h = new Hello23();
		int a = h.show(10);
		System.out.println(a);
		System.out.println(h.show(10));
		h.show(10);
		System.out.println("Hello23 Guys");
	}
}
class Hello23
{
	int show(int x)
	{
		return x+1;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab283.java

E:\JLC OOPs Lab>java Lab283
11
11
Hello23 Guys
*/