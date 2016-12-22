class Lab295
{
	public static void main(String[] args)
	{
		Hello34 h = new Hello34();
		//h.show(65);
		h.show('A');
		h.show((char)65);
	}
}
class Hello34
{
	void show(char x)
	{
		System.out.println("show(char)");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab295.java

E:\JLC OOPs Lab>java Lab295
show(char)
show(char)
*/