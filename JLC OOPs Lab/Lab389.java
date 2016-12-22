class Lab389
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
	public void m1(){}
	//public void m2(){}
	//public void m3(){}
}