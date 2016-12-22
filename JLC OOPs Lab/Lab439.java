abstract class Person
{
	public abstract void sleeping();
}
class Student extends Person
{
	public void sleeping()
	{
		System.out.println("Student -> sleeping()");
	}
}
class Lab439
{
	public static void main(String[] args)
	{
		Person p = new Student();
		p.sleeping();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab439.java

E:\JLC OOPs Lab>java Lab439
Student -> sleeping()
*/