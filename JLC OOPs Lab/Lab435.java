class Outer
{
	int a = 11;

	class Inner
	{
		int a = 22;
		void show()
		{
			System.out.println("Inner -> show()");
			int a = 33;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Inner.this.a);
			//System.out.println(super.a);
			System.out.println(Outer.this.a);
		}
	}
}
class Lab435
{
	public static void main(String[] args)
	{
		new Outer().new Inner().show();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab435.java

E:\JLC OOPs Lab>java Lab435
Inner -> show()
33
22
22
11
*/