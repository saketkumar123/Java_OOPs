class Lab299
{
	public static void main(String[] args)
	{
		Hello37 h = new Hello37();
		String a = h.add(99,"JLC");
		System.out.println(a);
		String b = h.add("JLC",99);
		System.out.println(b);
	}
}
class Hello37
{
	String add(int b,String a)
	{
		System.out.println("add(int,String)");
		return a+b;
	}
	String add(String a,int b)
	{
		System.out.println("add(String,int)");
		return a+b;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab299.java

E:\JLC OOPs Lab>java Lab299
add(int,String)
JLC99
add(String,int)
JLC99
*/