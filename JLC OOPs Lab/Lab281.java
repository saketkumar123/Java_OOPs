class Lab281
{
	public static void main(String[] args)
	{
		Operation1.showRemainder(10,4);
		Operation1.showRemainder(10,0);
	}
}
class Operation1
{
	static void showRemainder(int a,int b)
	{
		if(b==0)
			return;
		System.out.println(a % b);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab281.java

E:\JLC OOPs Lab>java Lab281
2
*/