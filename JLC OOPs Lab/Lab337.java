class Lab337
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
	}
}

class Hai
{	
	{
		System.out.println("Hai->I.B.");
	}
	static
	{
		System.out.println("Hai->S.B.");
	}
}
class Hello extends Hai
{
	{
		System.out.println("Hello->I.B.");
	}
	static
	{
		System.out.println("Hello->S.B.");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab337.java

E:\JLC OOPs Lab>java Lab337
Hai->S.B.
Hello->S.B.
Hai->I.B.
Hello->I.B.
*/