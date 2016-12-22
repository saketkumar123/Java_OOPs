class Lab309
{
	public static void main(String[] args)
	{
		Hai hai = new Hai();
		hai.a = 99;
		Hello46 hello = new Hello46();
		System.out.println("main begin: "+hai.a);
		hello.m1(hai);
		System.out.println("main ends: "+hai.a);

	}
}
class Hello46
{
	void m1(Hai hai)
	{
		System.out.println("m1 begin: "+hai.a);
		hai = new Hai();
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

E:\JLC OOPs Lab>javac Lab309.java

E:\JLC OOPs Lab>java Lab309
main begin: 99
m1 begin: 99
m1 ends: 10
main ends: 99
*/