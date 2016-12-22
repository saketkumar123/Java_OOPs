class Lab429
{
	public static void main(String[] args)
	{
		A aob = new D();
		D dob = new D();
		B bob = new B();
		C cob = new C();
		System.out.println(aob == dob);
		System.out.println(aob == bob);
		System.out.println(aob == cob);
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab429.java

E:\JLC OOPs Lab>java Lab429
false
false
false
*/