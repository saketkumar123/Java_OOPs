class Lab228
{
	public static void main(String[] args)
	{
		new Hello().a = 99;
		System.out.println(new Hello().a);
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

E:\JLC OOPs Lab>javac Lab228.java

E:\JLC OOPs Lab>java Lab228
0
*/