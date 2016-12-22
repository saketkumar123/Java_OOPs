class Lab231
{
	int a;
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab231.java
Lab231.java:6: error: non-static variable a cannot be referenced from a static context
                System.out.println(a);
                                   ^
1 error
*/