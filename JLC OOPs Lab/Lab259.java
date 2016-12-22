class Lab259
{
	public static void main(String[] args)
	{
		System.out.println("I am Main()");
		{
			int a = 10;
			System.out.println("I am Local Block 1 in Main(): "+a);
		}
		int a = 90;
		System.out.println("I am Main(): "+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab259.java

E:\JLC OOPs Lab>java Lab259
I am Main()
I am Local Block 1 in Main(): 10
I am Main(): 90
*/