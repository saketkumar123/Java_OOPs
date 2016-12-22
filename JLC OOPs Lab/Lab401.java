class Lab401
{
	public static void main(String[] args)
	{
		Shape sp = new Square();
		sp.area();
	}
}
class Shape
{
	abstract void area();
}
class Square extends Shape
{}


/*
Output
======
E:\JLC OOPs Lab>javac Lab401.java
Lab401.java:9: error: Shape is not abstract and does not override abstract method area() in Shape
class Shape
^
1 error
*/