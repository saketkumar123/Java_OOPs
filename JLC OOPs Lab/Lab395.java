class Lab395
{
	public static void main(String[] args)
	{
		Person pob = null;
		pob = new Student();
		pob.sleeping();
		pob = new Employee();
		pob.sleeping();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab395.java

E:\JLC OOPs Lab>java Lab395
Person -> sleeping()
Person -> sleeping()
*/