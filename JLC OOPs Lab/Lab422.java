class Lab422
{
	public static void main(String[] args)
	{
		D dobj = new D();
		A aobj = dobj;
		B bobj = aobj;
		D dobj1 = aobj;
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab422.java
Lab422.java:7: error: incompatible types: A cannot be converted to B
                B bobj = aobj;
                         ^
Lab422.java:8: error: incompatible types: A cannot be converted to D
                D dobj1 = aobj;
                          ^
2 errors
*/