class Lab303
{
	public static void main(String[] args)
	{
		Hello40 h = new Hello40();
		byte b = 20;
		h.add(b,b);
	}
}
class Hello40
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

E:\JLC OOPs Lab>javac Lab303.java
Lab303.java:7: error: reference to add is ambiguous
                h.add(b,b);
                 ^
  both method add(byte,int) in Hello39 and method add(int,byte) in Hello40 match

1 error
*/