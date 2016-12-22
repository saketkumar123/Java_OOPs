class Lab317
{
	public static void main(String[] args)
	{
		Hello53 h = new Hello53();
		h.show(10);
	}
}
class Hello53
{
	void show(int... arr,int...arr)
	{
		System.out.println("\nshow(int...,int...)");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab317.java
Lab317.java:11: error: ')' expected
        void show(int... arr,int...arr)
                            ^
Lab317.java:11: error: <identifier> expected
        void show(int... arr,int...arr)
                                ^
Lab317.java:11: error: <identifier> expected
        void show(int... arr,int...arr)
                                      ^
3 errors
*/