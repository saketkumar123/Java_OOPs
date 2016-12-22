abstract class Person
{
	public abstract void sleeping();
}
class Lab440
{
	public static void main(String[] args)
	{
		Person stu = new Person();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab440.java
Lab440.java:9: error: Person is abstract; cannot be instantiated
                Person stu = new Person();
                             ^
1 error
*/