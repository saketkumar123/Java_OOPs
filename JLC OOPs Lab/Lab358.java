package com.jlcindia.p2;
public class Lab358
{
	public static void main(String[] args)
	{
		com.jlcindia.p1.Hello hello = new com.jlcindia.p1.Hello();
		hello.show();
		com.jlcindia.p1.Hai hai = new com.jlcindia.p1.Hai();
		hai.display();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac -d . Lab358.java

E:\JLC OOPs Lab>java com.jlcindia.p2.Lab358
Hello -> S.B.
Hello -> show()
Hai -> S.B.
Hai -> display()
*/