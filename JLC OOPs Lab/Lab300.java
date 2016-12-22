class Lab300
{
	public static void main(String[] args)
	{
		Hello38 h = new Hello38();
		byte b = 20;
		h.add(10,b);
		h.add(b,b);
	}
}
class Hello38
{
	void add(int a,byte b)
	{
		System.out.println("add(int,byte)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab300.java

E:\JLC OOPs Lab>java Lab300
add(int,byte)
add(int,byte)
*/