class Lab424
{
	public static void main(String[] args)
	{
		A aobj = new D();
		C cobj = (C)aobj;
		System.out.println("Hello Guys");
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab424.java

E:\JLC OOPs Lab>java Lab424
Exception in thread "main" java.lang.ClassCastException: D cannot be cast to C
        at Lab424.main(Lab424.java:7)
        */