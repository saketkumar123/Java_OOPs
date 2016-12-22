class Lab291
{
	public static void main(String[] args)
	{
		Hello31 h = new Hello31();
		System.out.println(h.show(10));
	}
}
class Hello31
{
	boolean show(int x)
	{
		System.out.println("show()");
		return 0;
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab291.java
Lab291.java:14: error: incompatible types: int cannot be converted to boolean
                return 0;
                       ^
1 error
*/