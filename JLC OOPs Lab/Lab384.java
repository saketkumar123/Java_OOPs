class Lab384
{
	public static void main(String[] args)
	{
		new B().m1();
	}
}
class A
{
	void m1()
	{}
}
class B extends A
{
	private void m1()
	{}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab384.java
Lab384.java:5: error: m1() has private access in B
                new B().m1();
                       ^
Lab384.java:15: error: m1() in B cannot override m1() in A
        private void m1()
                     ^
  attempting to assign weaker access privileges; was package
2 errors
*/