class Lab333
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys");
	}
}
class A extends B
{}
class B extends A
{}

/*
Output
======

E:\JLC OOPs Lab>javac Lab333.java
Lab333.java:8: error: cyclic inheritance involving A
class A extends B
^
1 error
*/