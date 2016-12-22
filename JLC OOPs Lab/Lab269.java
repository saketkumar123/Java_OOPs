class Lab269
{
	public static void main(String[] args)
	{
		Student7 st = new Student7(88,"Srinivas");
		st.show();
		Student7 st1 = new Student7(99,"Dande");
		st1.show();
	}
}
class Student7
{
	int sid;
	String sname;
	Student7(int sid,String sname)
	{
		System.out.println("Student7 2-Arg constructor");
		sid = sid;
		sname = sname;
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab269.java

E:\JLC OOPs Lab>java Lab269
Student7 2-Arg constructor
0       null
Student7 2-Arg constructor
0       null
*/