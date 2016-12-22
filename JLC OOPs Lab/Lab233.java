class Lab233
{
	public static void main(String[] args)
	{
		Hello1 h1 = new Hello1();
		Hello1 h2 = new Hello1();
		System.out.println(h1.b+"\t"+h2.b);
		h1.b = 99;
		System.out.println(h1.b+"\t"+h2.b);
	}
}
/*
class Hello1
{
	static int b;
}
*/
/*
Output
======

E:\JLC OOPs Lab>javac Lab233.java

E:\JLC OOPs Lab>java Lab233
0       0
99      99
*/