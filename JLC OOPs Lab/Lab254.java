class Lab254
{
	public static void main(String[] args)
	{
		Hello12 h = new Hello12();
	}
}
class Hello12
{
	{
		int a = 10;
		System.out.println("I. Block 1: "+a);
	}
	{
		String a = "JLC";
		System.out.println("I. Block 2:"+a);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab254.java

E:\JLC OOPs Lab>java Lab254
I. Block 1: 10
I. Block 2:JLC
*/