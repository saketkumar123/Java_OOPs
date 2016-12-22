class Lab282
{
	public static void main(String[] args)
	{
		Operation.showRemainder(10,4);
		Operation.showRemainder(10,0);
	}
}
class Operation
{
	static /*void*/ int showRemainder(int a,int b)
	{
		if(b==0)
			return 0;
		System.out.println(a % b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab282.java
Lab282.java:16: error: missing return statement
        }
        ^
1 error
*/