class Lab275
{
	public static void main(String[] args)
	{
		Hello20 h = null;
		h.show();
		h = new Hello20();
		h.show();
		Hello20.show();
	}
}
class Hello20
{
	static void show()
	{
		System.out.println("static show()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab275.java

E:\JLC OOPs Lab>java Lab275
static show()
static show()
static show()
*/