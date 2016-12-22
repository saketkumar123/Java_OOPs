class Lab430
{
	public static void main(String[] args)
	{
		A aob = new D();
		E eob = new E();
		System.out.println(aob == eob);

		B bob = new B();
		C cob = new C();
		System.out.println(bob == cob);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab430.java
Lab430.java:7: error: incomparable types: A and E
                System.out.println(aob == eob);
                                       ^
Lab430.java:11: error: incomparable types: B and C
                System.out.println(bob == cob);
                                       ^
2 errors
*/