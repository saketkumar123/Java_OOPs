class Lab268
{
	public static void main(String[] args)
	{
		Hello15 h = new Hello15();
		h.show();
	}
}
class Hello15
{
	int a = 10;
	static int b = 20;
	void show()
	{
		String a = "JLC";
		String b = "SD";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Hello15.b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab268.java

E:\JLC OOPs Lab>java Lab268
JLC
SD
10
20
20
*/