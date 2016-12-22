class Lab287
{
	public static void main(String[] args)
	{
		Hello27 h = new Hello27();
		h.show(10);
		System.out.println("Hello27 Guys");
	}
}
class Hello27
{
	int show(int x)
	{
		System.out.println("show()");
		return 12L;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab287.java
Lab287.java:15: error: incompatible types: possible lossy conversion from long to int
                return 12L;
                       ^
1 error
*/