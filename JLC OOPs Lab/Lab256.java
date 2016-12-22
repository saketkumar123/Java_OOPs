class Lab256
{
	public static void main(String[] args)
	{
		Hello14 h = new Hello14();
		System.out.println("Main: "+h.a);
	}
}
class Hello14
{
	{
		int a = 10;
		System.out.println("I. Block 1: "+a);
	}
	static
	{
		int a = 10;
		System.out.println("I. Block 2:"+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab256.java
Lab256.java:6: error: cannot find symbol
                System.out.println("Main: "+h.a);
                                             ^
  symbol:   variable a
  location: variable h of type Hello14
1 error
*/