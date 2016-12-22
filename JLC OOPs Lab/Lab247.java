class Lab247
{
	public static void main(String[] args)
	{
		Hello8 h = new Hello8();
		new Hello8(); 
	}
}
/*
class Hello8
{
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("Static Block");
	}
}
*/

/*
Output
======

E:\JLC OOPs Lab>javac Lab247.java

E:\JLC OOPs Lab>java Lab247
Static Block
Instance Block
Instance Block
*/