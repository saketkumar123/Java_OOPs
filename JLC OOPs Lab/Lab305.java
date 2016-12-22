class Lab305
{
	public static void main(String[] args)
	{
		Hello42 h = new Hello42();
		byte b = 20;
		h.show("JLC");
		h.show(h);
		//h.show(null);
	}
}
class Hello42
{
	void show(String str)
	{
		System.out.println("show(String)");
	}
	void show(Hello42 str)
	{
		System.out.println("show(Hello42)");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab305.java
Lab305.java:9: error: reference to show is ambiguous
                h.show(null);
                 ^
  both method show(String) in Hello42 and method show(Hello42) in Hello42 match
1 error
*/
//-----------------------------------------------------------------------------

/*
after commenting line no 9

Output
======

E:\JLC OOPs Lab>javac Lab305.java

E:\JLC OOPs Lab>java Lab305
show(String)
show(Hello42)
*/