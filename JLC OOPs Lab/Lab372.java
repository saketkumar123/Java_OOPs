class Lab372
{
	public static void main(String[] args)
	{
		A aobj = new A(98);
		System.out.println(aobj.getX());
		aobj.setX(128);
		System.out.println(aobj.getX());
	}
}

class A
{
	private int x;
	A(int x)
	{
		this.x = x;
	}
		public void setX(int x)
		{
			this.x = x;
		}
		public int getX()
		{
			return this.x;
		}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab372.java

E:\JLC OOPs Lab>java Lab372
98
128
*/