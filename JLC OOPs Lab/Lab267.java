class Lab267
{
	public static void main(String[] args)
	{
		Hello14 h = new Hello14();
		h.show();
	}
}
class Hello14
{
	int a = 10;
	void show()
	{
		String a = "JLC";
		System.out.println(a);
		System.out.println(this.a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab267.java

E:\JLC OOPs Lab>java Lab267
JLC
10
*/