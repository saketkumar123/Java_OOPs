class Lab246
{
	public static void main(String[] args)
	{
		Hello8 h = null;
		System.out.println("Ref Created");
		h = new Hello8();
	}
}
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

/*
Output
======

E:\JLC OOPs Lab>javac Lab246.java

E:\JLC OOPs Lab>java Lab246
Ref Created
Static Block
Instance Block
*/