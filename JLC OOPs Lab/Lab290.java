class Lab290
{
	public static void main(String[] args)
	{
		Hello30 h = new Hello30();
		System.out.println(h.show(10));
	}
}
class Hello30
{
	boolean show(int x)
	{
		System.out.println("show()");
		return true;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab290.java

E:\JLC OOPs Lab>java Lab290
show()
true
*/