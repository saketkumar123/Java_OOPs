abstract class Person
{
	public abstract void sleeping();
}
class Lab442
{
	public static void main(String[] args)
	{
		Person stu = new Person()
		{
			public void sleeping()
			{
				System.out.println("Student -> sleeping()");
			}
		};
		stu.sleeping();
	}
}