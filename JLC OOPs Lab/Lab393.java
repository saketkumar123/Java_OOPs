class Lab393
{
	public static void main(String[] args)
	{
		Person pob = null;
		pob = new Student();
		pob.eating();
		pob = new Employee();
		pob.eating();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab393.java

E:\JLC OOPs Lab>java Lab393
Person -> eating()
Person -> eating()
*/