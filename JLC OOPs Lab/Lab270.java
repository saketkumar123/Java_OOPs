class Lab270
{
	public static void main(String[] args)
	{
		Student8 st = new Student8(88,"Srinivas");
		st.show();
		Student8 st1 = new Student8(99,"Dande");
		st1.show();
	}
}
class Student8
{
	int sid;
	String sname;
	Student8(int sid,String sname)
	{
		System.out.println("Student7 2-Arg constructor");
		this.sid = sid;
		this.sname = sname;
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab270.java

E:\JLC OOPs Lab>java Lab270
Student7 2-Arg constructor
88      Srinivas
Student7 2-Arg constructor
99      Dande
*/