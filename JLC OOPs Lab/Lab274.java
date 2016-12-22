class Lab274
{
	public static void main(String[] args)
	{
		Hello19 h = null;
		//h.show();
		h = new Hello19();
		h.show();
		//Hello19.show();
	}
}
class Hello19
{
	void show()
	{
		System.out.println("Instance show()");
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab274.java

E:\JLC OOPs Lab>java Lab274
Instance show()
*/