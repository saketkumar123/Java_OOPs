class Lab271
{
	public static void main(String[] args)
	{
		Hello16 h = new Hello16(99);
		h.show();
	}
}
class Hello16
{
	int a;
	Hello16()
	{
		System.out.println("Hello16 DC");
	}
	Hello16(int a)
	{
		this();
		System.out.println("Hello16 1-Arg Constructor");
		this.a = a;
	}
	void show()
	{
		System.out.println(a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab271.java

E:\JLC OOPs Lab>java Lab271
Hello16 DC
Hello16 1-Arg Constructor
99
*/