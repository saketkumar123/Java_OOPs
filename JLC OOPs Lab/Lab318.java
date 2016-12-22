class Lab318
{
	public static void main(String[] args)
	{
		Hello54 h = new Hello54();
		h.show(10);
	}
}
class Hello54
{
	void show(int... arr)
	{
		System.out.println("\nshow(int...)");
	}
	void show(int[] arr)
	{
		System.out.println("\nshow(int[])");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab318.java
Lab318.java:15: error: cannot declare both show(int[]) and show(int...) in Hello54
        void show(int[] arr)
             ^
1 error
*/