class Lab326
{
	public static void main(String[] args)
	{
		Hello56 h1 = new Hello56();
		h1.m1();
		h1.m2();
		
	}
}
class Hai
{
	int a = 99;
	void m1()
	{
		System.out.println("Hai -> m1: "+a);
		System.out.println("Hai -> m1: "+b);
	}
}
class Hello56 extends Hai
{
	int b = 88;
	void m2()
	{
		System.out.println("Hai -> m2: "+a);
		System.out.println("Hai -> m2: "+b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab326.java
Lab326.java:17: error: cannot find symbol
                System.out.println("Hai -> m1: "+b);
                                                 ^
  symbol:   variable b
  location: class Hai
1 error
*/