class Lab333
{
	public static void main(String[] args)
	{
		System.out.println("Hello Guys");
	}
}
final class A
{}
class B extends A
{}

/*
Output
======

E:\JLC OOPs Lab>javac Lab334.java
Lab334.java:10: error: cannot inherit from final A
class B extends A
                ^
1 error
*/