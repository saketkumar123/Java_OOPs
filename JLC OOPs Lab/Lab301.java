class Lab301
{
	public static void main(String[] args)
	{
		Hello38 h = new Hello38();
		byte b = 20;
		h.add(b,10);
		h.add(b,b);
	}
}
class Hello38
{
	void add(byte a,int b)
	{
		System.out.println("add(byte,int)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab301.java

E:\JLC OOPs Lab>java Lab301
add(byte,int)
add(byte,int)
*/