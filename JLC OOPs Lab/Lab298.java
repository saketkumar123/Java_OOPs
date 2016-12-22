class Lab298
{
	public static void main(String[] args)
	{
		Hello36 h = new Hello36();
		int a = h.add(10,20);
		System.out.println(a);
		String b = h.add("JLC",99);
		System.out.println(b);
	}
}
class Hello36
{
	int add(int a,int b)
	{
		System.out.println("add(int,int)");
		return a+b;
	}
	String add(String a,int b)
	{
		System.out.println("add(int,String)");
		return a+b;
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab298.java

E:\JLC OOPs Lab>java Lab298
add(int,int)
30
add(int,String)
JLC99
*/