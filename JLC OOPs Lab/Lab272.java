class Lab272
{
	public static void main(String[] args)
	{
		Hello17 h = new Hello17();
	}
}
class Hello17
{
	Hello17()
	{
		this();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab272.java
Lab272.java:10: error: recursive constructor invocation
        Hello17()
        ^
1 error
*/