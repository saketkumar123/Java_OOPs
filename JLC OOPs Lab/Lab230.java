class Lab230
{
	public static void main(String[] args)
	{
		System.out.println(Hello.a);
	}
}
/*
class Hello
{
	int a;
}
*/

/*
Output
======

E:\JLC OOPs Lab>javac Lab230.java
Lab230.java:5: error: non-static variable a cannot be referenced from a static context
                System.out.println(Hello.a);
                                        ^
1 error
*/