class Lab244
{
	public static void main(String[] args)
	{
		System.out.println(Hello7.a);
		System.out.println(Hello7.a);
	}
}
class Hello7
{
	static int a = 10;
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("static Block");
	}
}