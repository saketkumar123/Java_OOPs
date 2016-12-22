class Lab253
{
	public static void main(String[] args)
	{
		System.out.println("Main: "+Hello11.a);
	}
}
class Hello11
{
	static int a;
	static
	{
		final int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
}