class Lab239
{
	public static void main(String[] args)
	{
		Hello2 h = new Hello2();
		System.out.println(h.a);
	}
}
class Hello2
{
	int a;
	a = 10;
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab239.java
Lab239.java:12: error: <identifier> expected
        a = 10;
         ^
1 error
*/