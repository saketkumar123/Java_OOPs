class Lab286
{
	public static void main(String[] args)
	{
		Hello26 h = new Hello26();
		h.show(10);
		System.out.println("Hello26 Guys");
	}
}
class Hello26
{
	int show(int x)
	{
		System.out.println("show()");
		return;
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab286.java
Lab286.java:15: error: incompatible types: missing return value
                return;
                ^
1 error
*/