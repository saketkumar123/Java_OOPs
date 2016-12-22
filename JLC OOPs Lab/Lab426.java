class Lab426
{
	public static void main(String[] args)
	{
		A aobj = new D();
		E eobj = (E)aobj;
		System.out.println("Hello Guys");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab426.java
Lab426.java:6: error: incompatible types: A cannot be converted to E
                E eobj = (E)aobj;
                            ^
1 error
*/