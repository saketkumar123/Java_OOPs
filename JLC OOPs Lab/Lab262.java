class Lab262
{
	public static void main(String[] args)
	{
		
		Student3 st = new Student3(88,"Srinivas");
		st.show();
		Student3 st1 = new Student3(99,"Dande");
		st1.show();
		
	}
}

class Student3
{
	int sid;
	String sname;

	Student3(int id,String sn)
	{
		System.out.println("Student3 2-Arg constructor");
		sid = id;
		sname = sn;
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab262.java

E:\JLC OOPs Lab>java Lab262
Student3 2-Arg constructor
88      Srinivas
Student3 2-Arg constructor
99      Dande
*/