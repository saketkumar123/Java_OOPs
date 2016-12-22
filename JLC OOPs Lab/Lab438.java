class Outer
{
	int a = 10;
	static int b = 20;
	void show()
	{
		System.out.println("Outer -> show() Begin");

		class Inner
		{
			void m1()
			{
				System.out.println("Inner -> m1()");
				System.out.println(a);
				System.out.println(b);
			}
		}
		new Inner().m1();
		System.out.println("Outer -> show() End");
	}
}
class Lab438
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.show();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab438.java

E:\JLC OOPs Lab>java Lab438
Outer -> show() Begin
Inner -> m1()
10
20
Outer -> show() End
*/