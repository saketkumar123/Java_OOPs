class Lab277
{
	public static void main(String[] args)
	{
		Hello22 h = new Hello22();
		h.show();
	}
}
class Hello22
{
	int a;
	static int b;
	static void show()
	{
		System.out.println(a);
		//Hello22 h = new Hello22();
		//System.out.println(h.a);
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab277.java
Lab277.java:15: error: non-static variable a cannot be referenced from a static context
                System.out.println(a);
                                   ^
1 error
*/