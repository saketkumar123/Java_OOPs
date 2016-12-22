class Lab315
{
	public static void main(String[] args)
	{
		Hello51 h = new Hello51();
		h.show(10);
		h.show(10,20);
		h.show(10,20,30);
	}
}
class Hello51
{
	void show(int a,int... arr)
	{
		System.out.println("\nshow(int,int...)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab315.java

E:\JLC OOPs Lab>java Lab315

show(int,int...)

show(int,int...)

show(int,int...)
*/