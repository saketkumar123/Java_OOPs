class Lab386
{
	public static void main(String[] args)
	{
		new B().m1();
	}
}
class A
{
	protected void m1(){}
	protected void m2(){}
	//void m3(){}
}
class B extends A
{
	private void m1(){}
	void m2(){}
	//public void m3(){}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab386.java
Lab386.java:16: error: m1() in B cannot override m1() in A
        private void m1(){}
                     ^
  attempting to assign weaker access privileges; was protected
Lab386.java:17: error: m2() in B cannot override m2() in A
        void m2(){}
             ^
  attempting to assign weaker access privileges; was protected
2 errors
*/