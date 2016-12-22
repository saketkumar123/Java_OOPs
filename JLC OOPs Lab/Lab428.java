class Lab428
{
	public static void main(String[] args)
	{
		A aob = new D();
		System.out.println(aob instanceof E);
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab428.java
Lab428.java:6: error: incompatible types: A cannot be converted to E
                System.out.println(aob instanceof E);
                                   ^
1 error
*/