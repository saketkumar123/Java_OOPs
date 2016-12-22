class Lab427
{
	public static void main(String[] args)
	{
		A aobj = new D();
		System.out.println(aobj instanceof A);
		System.out.println(aobj instanceof B);
		System.out.println(aobj instanceof C);
		System.out.println(aobj instanceof D);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab427.java

E:\JLC OOPs Lab>java Lab427
true
true
false
true
*/