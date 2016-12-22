class Lab255
{
	public static void main(String[] args)
	{
		Hello13 h = new Hello13();
	}
}
class Hello13
{
	{
		int a = 10;
		System.out.println("I. Block 1: "+a);
	}
	{
		System.out.println("I. Block 2:"+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab255.java
Lab255.java:15: error: cannot find symbol
                System.out.println("I. Block 2:"+a);
                                                 ^
  symbol:   variable a
  location: class Hello13
1 error
*/