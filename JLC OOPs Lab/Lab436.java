class Outer
{
	int a = 10;
	static int b = 20;
	void m1()
	{
		System.out.println("Outer -> m1()");
	}
	static void m2()
	{
		System.out.println("Outer -> m2()");
	}

	static class Inner
	{
		int x = 11;
		static int y = 22;
		void show()
		{
			System.out.println("Inner -> show()");
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
			m2();
		}
		static void m3()
		{
			System.out.println("Inner -> m3()");
		}
	}
}

class Lab436
{
	public static void main(String[] args)
	{
		Outer outob = new Outer();
		outob.m1();
		outob.m2();
		Outer.Inner inob = new Outer.Inner();
		inob.show();
		inob.m3();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab436.java

E:\JLC OOPs Lab>java Lab436
Outer -> m1()
Outer -> m2()
Inner -> show()
20
11
22
Outer -> m2()
Inner -> m3()
*/