class Lab240
{
	public static void main(String[] args)
	{
		System.out.println(Hello3.a);
	}
}
class Hello3
{
	static int a;
	a = 10;
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab240.java
Lab240.java:11: error: <identifier> expected
        a = 10;
         ^
1 error
*/