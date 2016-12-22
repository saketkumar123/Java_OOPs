class Lab236
{
	public static void main(String[] args)
	{
		new Hello1().b = 99;
		System.out.println(new Hello1().b);
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

E:\JLC OOPs Lab>javac Lab236.java

E:\JLC OOPs Lab>java Lab236
99
*/