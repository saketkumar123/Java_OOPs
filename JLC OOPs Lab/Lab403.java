abstract class Shape
{
	abstract void area();
}
class Square extends Shape
{

}
class Lab403
{
	public static void main(String[] args)
	{
		Shape sp = new Square();
		sp.area();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab403.java
Lab403.java:5: error: Square is not abstract and does not override abstract meth
od area() in Shape
class Square extends Shape
^
1 error
*/