package com.jlcindia.p2;
import static com.jlcindia.p1.Hello.*;
import static com.jlcindia.p1.Hai.*;
public class Lab366
{
	public static void main(String[] args)
	{
		Hello hello = new Hello();
		Hai hai = new Hai();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac -d . Lab366.java
Lab366.java:8: error: cannot find symbol
                Hello hello = new Hello();
                ^
  symbol:   class Hello
  location: class Lab366
Lab366.java:8: error: cannot find symbol
                Hello hello = new Hello();
                                  ^
  symbol:   class Hello
  location: class Lab366
Lab366.java:9: error: cannot find symbol
                Hai hai = new Hai();
                ^
  symbol:   class Hai
  location: class Lab366
Lab366.java:9: error: cannot find symbol
                Hai hai = new Hai();
                              ^
  symbol:   class Hai
  location: class Lab366
4 errors
*/