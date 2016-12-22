class Lab377
{
	public static void main(String[] args)
	{
		Hai hai = new Hai();
		hai.m1();
	}
}
class Hello
{
	A m1()
	{
		return new A();
	}
}
class Hai extends Hello
{
	B m1()
	{
		return new B();
	}
}
class A{}
class B{}

/*
Output
======

E:\JLC OOPs Lab>javac Lab377.java
Lab377.java:18: error: m1() in Hai cannot override m1() in Hello
        B m1()
          ^
  return type B is not compatible with A
1 error
*/