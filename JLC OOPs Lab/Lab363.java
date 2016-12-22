package com.jlcindia.p2;
import static com.jlcindia.p1.Hello.A;
import static com.jlcindia.p1.Hello.m1;
import static com.jlcindia.p1.Hai.m3;
public class Lab363
{
	public static void main(String[] args)
	{
		System.out.println(A);
		m1();
		m3();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac -d . Lab363.java

E:\JLC OOPs Lab>java com.jlcindia.p2.Lab363
90
Hello -> m1()
Hai -> m3()
*/