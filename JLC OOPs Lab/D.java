package com.jlc.p2;
import com.jlc.p1.A;
public class D extends A
{
	public void showD()
	{
		System.out.println("D->show()");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

/*
Output
======

D.java:3: error: cannot find symbol
public class D extends A
                       ^
  symbol: class A
D.java:10: error: cannot find symbol
                System.out.println(c);
                                   ^
  symbol:   variable c
  location: class D
D.java:11: error: cannot find symbol
                System.out.println(d);
                                   ^
  symbol:   variable d
  location: class D
3 errors
*/