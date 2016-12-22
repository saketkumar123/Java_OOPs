class Lab296
{
	public static void main(String[] args)
	{
		Hello35 h = new Hello35();
		int a = h.add(10,20);
		System.out.println(a);
		h.add(10,20);
	}
}
class Hello35
{
	int add(int a,int b)
	{
		System.out.println("add(int,int)");
		return a+b;
	}
	void add(int a,int b)
	{
		System.out.println("add(int,int)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab296.java
Lab296.java:18: error: method add(int,int) is already defined in class Hello35
        void add(int a,int b)
             ^
1 error
*/