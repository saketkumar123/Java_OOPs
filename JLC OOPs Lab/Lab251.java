class Lab251
{
	public static void main(String[] args)
	{
		Hello9 h = new Hello9();
	}
}
class Hello9
{
	int a;
	static int b;
	{
		int c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab251.java
Lab251.java:16: error: variable c might not have been initialized
                System.out.println(c);
                                   ^
1 error
*/