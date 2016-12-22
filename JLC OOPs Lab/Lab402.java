class Lab402
{
	public static void main(String[] args)
	{
		Shape sp = new Square();
		sp.area();
	}
}
abstract class Shape
{
	abstract void area();
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab402.java

E:\JLC OOPs Lab>java Lab402
Exception in thread "main" java.lang.AbstractMethodError: Shape.area()V
        at Lab402.main(Lab402.java:6)
        */