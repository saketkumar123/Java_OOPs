class Lab306
{
	public static void main(String[] args)
	{
		Hello43 h = new Hello43();
		int n = 4;
		long fact = h.factorial(n);
		System.out.println("factorial is: "+fact);
	}
}
class Hello43
{
	long factorial(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		else
			return n*factorial(n-1);
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab306.java

E:\JLC OOPs Lab>java Lab306
factorial is: 24
*/