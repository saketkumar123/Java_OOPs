class Lab394
{
	public static void main(String[] args)
	{
		Person pob = null;
		pob = new Student();
		pob.walking();
		pob = new Employee();
		pob.walking();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab394.java

E:\JLC OOPs Lab>java Lab394
Student -> walking()
Employee -> walking()
*/