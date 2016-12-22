class Lab302
{
	public static void main(String[] args)
	{
		Hello39 h = new Hello39();
		byte b = 20;
		h.add(b,10);
		h.add(10,b);
	}
}
class Hello39
{
	void add(byte a,int b)
	{
		System.out.println("add(byte,int)");
	}
	void add(int a,byte b)
	{
		System.out.println("add(int,byte)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab302.java

E:\JLC OOPs Lab>java Lab302
add(byte,int)
add(int,byte)
*/