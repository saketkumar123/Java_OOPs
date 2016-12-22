class Lab406
{
	public static void main(String[] args)
	{
		Person p = new CurrentStudent();
		p.sleeping();
	}
}
abstract class Person
{
	abstract void sleeping();
}
abstract class Student extends Person
{
	void sleeping()
	{
		System.out.println("Student -> sleeping()");
	}
}
class CurrentStudent extends Student{}



/*
Output
======

E:\JLC OOPs Lab>javac Lab406.java

E:\JLC OOPs Lab>java Lab406
Student -> sleeping()
*/