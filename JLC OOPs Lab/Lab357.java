package com.jlcindia.p2;
public class Lab357
{
	public static void main(String[] args)
	{
		Hello hello = new Hello();
		hello.show();
		Hai hai = new Hai();
		hai.display();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac -d . Lab357.java
Lab357.java:6: error: cannot find symbol
                Hello hello = new Hello();
                ^
  symbol:   class Hello
  location: class Lab357
Lab357.java:6: error: cannot find symbol
                Hello hello = new Hello();
                                  ^
  symbol:   class Hello
  location: class Lab357
Lab357.java:8: error: cannot find symbol
                Hai hai = new Hai();
                ^
  symbol:   class Hai
  location: class Lab357
Lab357.java:8: error: cannot find symbol
                Hai hai = new Hai();
                              ^
  symbol:   class Hai
  location: class Lab357
4 errors
*/