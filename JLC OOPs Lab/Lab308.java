class Lab308
{
	public static void main(String[] args)
	{
		Hai hai = new Hai();
		hai.a = 99;
		Hello45 hello = new Hello45();
		System.out.println("main begin: "+hai.a);
		hello.m1(hai);
		System.out.println("main ends: "+hai.a);

	}
}
class Hello45
{
	void m1(Hai hai)
	{
		System.out.println("m1 begin: "+hai.a);
		hai.a = hai.a+10;
		System.out.println("m1 ends: "+hai.a);
	}
}
class Hai
{
	int a;
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab308.java

E:\JLC OOPs Lab>java Lab308
main begin: 99
m1 begin: 99
m1 ends: 109
main ends: 109
*/