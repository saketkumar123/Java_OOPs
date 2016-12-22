class Lab304
{
	public static void main(String[] args)
	{
		Hello41 h = new Hello41();
		byte b = 20;
		h.show(null);
		h.show("JLC");
		h.show(h);
	}
}
class Hello41
{
	void show(String str)
	{
		System.out.println("show(String)");
	}
	void show(Object str)
	{
		System.out.println("show(Object)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab304.java

E:\JLC OOPs Lab>java Lab304
show(String)
show(String)
show(Object)
*/