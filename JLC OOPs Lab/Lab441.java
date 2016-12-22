abstract class Person
{
	public abstract void sleeping();
}
class Lab441
{
	public static void main(String[] args)
	{
		Person stu = new Person(){};
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab441.java
Lab441.java:9: error: <anonymous Lab441$1> is not abstract and does not override
 abstract method sleeping() in Person
                Person stu = new Person(){};
                                         ^
1 error
*/