package com.jlc.p2;
import com.jlc.p1.Hello;

class Xyz extends Hello{}

class Hai extends Hello
{
	void show()
	{
		System.out.println("Hai -> show()");
		Hello h = new Hello();
		System.out.println(h.ab);
		Xyz ref = new Xyz();
		System.out.println(ref.ab);
	}
}
class Lab371
{
	public static void main(String[] args)
	{
		Hai hai = new Hai();
		hai.show();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac -d . Lab371.java
Lab371.java:12: error: ab has protected access in Hello
                System.out.println(h.ab);
                                    ^
Lab371.java:14: error: ab has protected access in Hello
                System.out.println(ref.ab);
                                      ^
2 errors
*/