class Lab294
{
	public static void main(String[] args)
	{
		Hello33 h = new Hello33();
		//h.show(12);
		byte b = 12;
		h.show(b);
		h.show((byte)12);
	}
}
class Hello33
{
	void show(byte x)
	{
		System.out.println("show(byte)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab294.java

E:\JLC OOPs Lab>java Lab294
show(byte)
show(byte)
*/