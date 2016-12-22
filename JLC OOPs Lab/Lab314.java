class Lab314
{
	public static void main(String[] args)
	{
		Hello50 h = new Hello50();
		h.show();
	}
}
class Hello50
{
	void show(int a,int... arr)
	{
		System.out.println("\nshow(int,int...");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab314.java
Lab314.java:6: error: method show in class Hello50 cannot be applied to given types;
                h.show();
                 ^
  required: int,int[]
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/