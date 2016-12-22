class Lab284
{
	public static void main(String[] args)
	{
		Hello24 h = new Hello24();
		System.out.println(h.show(10));
	}
}
class Hello24
{
	void show(int x)
	{
		System.out.println("show()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab284.java
Lab284.java:6: error: 'void' type not allowed here
                System.out.println(h.show(10));
                                         ^
1 error
*/