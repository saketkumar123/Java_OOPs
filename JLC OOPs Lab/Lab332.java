class Lab332
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys");
	}
}
class A extends A
{}


/*
Output
======

E:\JLC OOPs Lab>javac Lab332.java
Lab332.java:8: error: cyclic inheritance involving A
class A extends A
^
1 error
*/