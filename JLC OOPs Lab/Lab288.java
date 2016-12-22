class Lab288
{
	public static void main(String[] args)
	{
		Hello28 h = new Hello28();
		System.out.println(h.show(10));
	}
}
class Hello28
{
	long show(int x)
	{
		System.out.println("show()");
		return 'A';
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab288.java

E:\JLC OOPs Lab>java Lab288
show()
65
*/