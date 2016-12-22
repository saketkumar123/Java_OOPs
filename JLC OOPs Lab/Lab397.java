class Lab397
{
	public static void main(String[] args)
	{
		Person pob = null;
		pob = new Student();
		Student stu = (Student)pob; //Downcasting
		stu.reading();
		pob = new Employee();
		Employee emp = (Employee)pob;//Downcasting
		emp.working();
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab397.java

E:\JLC OOPs Lab>java Lab397
Student -> reading()
Employee -> working()
*/