package com.jlcindia.p2;
import com.jlcindia.p1.*;
public class Lab360
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

E:\JLC OOPs Lab>javac -d . Lab360.java

E:\JLC OOPs Lab>java com.jlcindia.p2.Lab360
Hello -> S.B.
Hello -> show()
Hai -> S.B.
Hai -> display()
*/