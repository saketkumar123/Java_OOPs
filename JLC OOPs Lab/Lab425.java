class Lab425
{
	public static void main(String[] args)
	{
		A aobj = new D();
		if(aobj instanceof C){
			C cobj = (C)aobj;
		}
		System.out.println("Hello Guys");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab425.java

E:\JLC OOPs Lab>java Lab425
Hello Guys
*/