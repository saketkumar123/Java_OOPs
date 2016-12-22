class Lab316
{
	public static void main(String[] args)
	{
		Hello52 h = new Hello52();
		h.show();
	}
}
class Hello52
{
	void show(int... arr)
	{
		System.out.println("\nshow(int...)");
	}
	void show(String... a)
	{
		System.out.println("\nshow(String...");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab316.java
Lab316.java:6: error: reference to show is ambiguous
                h.show();
                 ^
  both method show(int...) in Hello52 and method show(String...) in Hello52 match
1 error
*/