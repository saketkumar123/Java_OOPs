class Lab250
{
	public static void main(String[] args)
	{
		Hello9 h = new Hello9();
	}
}
class Hello9
{
	int a;
	static int b;
	{
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab250.java

E:\JLC OOPs Lab>java Lab250
0
0
30
*/