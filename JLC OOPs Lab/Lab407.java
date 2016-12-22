abstract class Hello
{
	static int A = 1234;
	static void show()
	{
		System.out.println("Hello -> show()");
	}
}
class Lab407
{
	public static void main(String[] args)
	{
		System.out.println(Hello.A);
		Hello.show();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab407.java

E:\JLC OOPs Lab>java Lab407
1234
Hello -> show()
*/