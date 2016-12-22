package com.jlcindia.p2;
import static com.jlcindia.p1.Hello.*;
import static com.jlcindia.p1.Hai.*;
public class Lab365
{
	public static void main(String[] args)
	{
		System.out.println(B);
		Hello.m2();
		Hai.m4();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac -d . Lab365.java
Lab365.java:8: error: cannot find symbol
                System.out.println(B);
                                   ^
  symbol:   variable B
  location: class Lab365
Lab365.java:9: error: cannot find symbol
                m2();
                ^
  symbol:   method m2()
  location: class Lab365
Lab365.java:10: error: cannot find symbol
                m4();
                ^
  symbol:   method m4()
  location: class Lab365
3 errors
*/