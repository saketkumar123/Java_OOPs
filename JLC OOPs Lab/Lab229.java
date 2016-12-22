class Lab229
{
	public static void main(String[] args)
	{
		Hello h = null;
		System.out.println(h.a);
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

E:\JLC OOPs Lab>javac Lab229.java

E:\JLC OOPs Lab>java Lab229
Exception in thread "main" java.lang.NullPointerException
        at Lab229.main(Lab229.java:6)
        */