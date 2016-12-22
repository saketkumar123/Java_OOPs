class Lab248
{
	public static void main(String[] args)
	{
		System.out.println("Main: "+Hello9.a);
	}
}
class Hello9
{
	static int a;
	int b;
	static
	{
		a = 10;
		b = 20;
		System.out.println("static Block");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab248.java
Lab248.java:15: error: non-static variable b cannot be referenced from a static
context
                b = 20;
                ^
1 error
*/