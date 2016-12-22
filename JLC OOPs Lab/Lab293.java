class Lab293
{
	public static void main(String[] args)
	{
		Hello32 h = new Hello32();
		//System.out.println(h.show());
		//System.out.println(h.show(10,20));
		System.out.println(h.show(10));
	}
}
class Hello32
{
	int show(int x)
	{
		System.out.println("show()");
		return x+1;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab293.java

E:\JLC OOPs Lab>java Lab293
show()
11
*/