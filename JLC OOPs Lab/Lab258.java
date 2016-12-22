class Lab258
{
	public static void main(String[] args)
	{
		System.out.println("I am Main()");
		int a = 90;
		{
			int a = 10;
			System.out.println("I am Local Block 1 in main(): "+a);
		}
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab258.java
Lab258.java:8: error: variable a is already defined in method main(String[])
                        int a = 10;
                            ^
1 error
*/