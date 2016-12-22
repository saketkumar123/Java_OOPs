class Lab336
{
	public static void main(String[] args)
	{
		new Hello();
	}
}

class Hai
{
	int a = 99;
	{
		System.out.println("Hai->I.B.: "+a);
	}
}
class Hello extends Hai
{
	int b = 88;
	{
		System.out.println("Hello->I.B.: "+a);
		System.out.println("Hello->I.B.: "+b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab336.java

E:\JLC OOPs Lab>java Lab336
Hai->I.B.: 99
Hello->I.B.: 99
Hello->I.B.: 88
*/