class Lab289
{
	public static void main(String[] args)
	{
		Hello29 h = new Hello29();
		System.out.println(h.show(10));
	}
}
class Hello29
{
	long show(int x)
	{
		System.out.println("show()");
		return x+1;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab289.java

E:\JLC OOPs Lab>java Lab289
show()
11
*/