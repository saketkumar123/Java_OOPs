class Lab257
{
	public static void main(String[] args)
	{
		{
			System.out.println("I am Main()");
		}
		{
			int a = 10;
			System.out.println("I am local Block 1 in main(): "+a);
		}
		{
			int a = 20;
			System.out.println("I am local Block 2 in main(): "+a);
		}
		{
			int a = 30;
			System.out.println("I am local Block 3 in main(): "+a);
		}
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab257.java

E:\JLC OOPs Lab>java Lab257
I am Main()
I am local Block 1 in main(): 10
I am local Block 2 in main(): 20
I am local Block 3 in main(): 30
*/