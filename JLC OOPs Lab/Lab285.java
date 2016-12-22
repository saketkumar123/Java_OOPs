class Lab285
{
	public static void main(String[] args)
	{
		Hello25 h = new Hello25();
		h.show(10);
		System.out.println("show()");
	}
}
class Hello25
{
	int show(int x)
	{
		System.out.println("show()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab285.java
Lab285.java:15: error: missing return statement
        }
        ^
1 error
*/