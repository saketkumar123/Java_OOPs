class Lab292
{
	public static void main(String[] args)
	{
		Hello32 h = new Hello32();
		System.out.println(h.isDigit('A'));
		System.out.println(h.isDigit('8'));
	}
}
class Hello32
{
	boolean isDigit(char ch)
	{
		System.out.println("isDigit(): "+ch);
		if(ch>=48 && ch<=57)
			return true;
		else
			return false;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab292.java

E:\JLC OOPs Lab>java Lab292
isDigit(): A
false
isDigit(): 8
true
*/