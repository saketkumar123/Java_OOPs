class Lab376
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.show();
	}
}
class A
{
	long show()
	{
		return 0;
	}
}
class B extends A
{
	int show()
	{
		return 0;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab376.java
Lab376.java:18: error: show() in B cannot override show() in A
        int show()
            ^
  return type int is not compatible with long
1 error
*/