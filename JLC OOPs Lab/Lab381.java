class Lab382
{
	public static void main(String[] args)
	{
		B bobj = new B();
		B.m1();
	}
}
class A
{
	void m1()
	{
		System.out.println("m1 -> A");
	}
}
class B extends A
{
	final void m1()
	{
		System.out.println("m1 -> B");
	}
}