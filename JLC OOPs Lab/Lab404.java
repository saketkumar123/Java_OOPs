abstract class Shape
{
	abstract void area();
}
class Square extends Shape
{
	void area()
	{
		System.out.println("Square -> area");
	}
}
class Lab404
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

E:\JLC OOPs Lab>javac Lab404.java

E:\JLC OOPs Lab>java Lab404
Square -> area
*/