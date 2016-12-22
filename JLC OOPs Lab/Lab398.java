class Lab398
{
	public static void main(String[] args)
	{
		A aobj = new B();
		System.out.println(aobj.x);
	}
}
class A
{
	int x = 10;
}
class B extends A
{
	String x = "JLC";
} 

/*
Output
======

E:\JLC OOPs Lab>javac Lab398.java

E:\JLC OOPs Lab>java Lab398
10
*/