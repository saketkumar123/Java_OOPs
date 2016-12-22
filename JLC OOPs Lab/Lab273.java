class Lab273
{
	public static void main(String[] args)
	{
		Hello18 h = new Hello18();
	}
}
class Hello18
{
	Hello18()
	{
		this(10);
	}
	Hello18(int a)
	{
		this();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab273.java
Lab273.java:14: error: recursive constructor invocation
        Hello18(int a)
        ^
1 error
*/