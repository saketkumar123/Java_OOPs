class Lab323
{
	public static void main(String[] args)
	{
		Hai h1 = new Hai();
		System.out.println(h1.a);
		System.out.println(h1.b);

		Hello55 h2 = new Hello55();
		System.out.println(h2.a);
		System.out.println(h2.b); 
	}
}
class Hai
{
	int a = 99;
}
class Hello55
{
	int b = 88;
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab323.java
Lab323.java:7: error: cannot find symbol
                System.out.println(h1.b);
                                     ^
  symbol:   variable b
  location: variable h1 of type Hai
Lab323.java:10: error: cannot find symbol
                System.out.println(h2.a);
                                     ^
  symbol:   variable a
  location: variable h2 of type Hello55
2 errors
*/