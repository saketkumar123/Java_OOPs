class Lab343
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
		h.show();
	}
}
class Hai
{
	static int a = 10;
}
class Hello extends Hai
{
	static int a = 20;
	void show()
	{
		int a = 30;
		System.out.println(a);
		//System.out.println(this.a);
		//System.out.println(super.a);
		System.out.println(Hello.a);
		System.out.println(Hai.a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab343.java

E:\JLC OOPs Lab>java Lab343
30
20
10
*/