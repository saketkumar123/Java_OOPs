package com.jlcindia.p2;
import com.jlcindia.p1.Hello;
import com.jlcindia.p1.Hai;
public class Lab359
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

E:\JLC OOPs Lab>javac -d . Lab359.java

E:\JLC OOPs Lab>java com.jlcindia.p2.Lab359
Hello -> S.B.
Hello -> show()
Hai -> S.B.
Hai -> display()
*/