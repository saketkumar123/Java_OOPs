class Lab227
{
	public static void main(String[] args)
	{
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		System.out.println(h1.a+"\t"+h2.a);
		h1.a = 99;
		System.out.println(h1.a+"\t"+h2.a);
	}
}
/*
class Hello
{
	int a;
}
*/
/*
Output
======

E:\JLC OOPs Lab>javac Lab227.java

E:\JLC OOPs Lab>java Lab227
0       0
99      0
*/