class Lab388
{
	public static void main(String[] args)
	{
		new B().m1();
	}
}
class A
{
	public void m1(){}
	//protected void m2(){}
	//void m3(){}
}
class B extends A
{
	protected void m1(){}
	//public void m2(){}
	//public void m3(){}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab388.java
Lab388.java:16: error: m1() in B cannot override m1() in A
        protected void m1(){}
                       ^
  attempting to assign weaker access privileges; was public
1 error
*/