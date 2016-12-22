class Lab261
{
	public static void main(String[] args)
	{
		Student2 st = new Student2();
		st.sid = 99;
		st.sname = "Srinivas";
		st.show();
		
	}
}

class Student2
{
	int sid;
	String sname;

	Student2()
	{
		System.out.println("Student2 default constructor");
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab261.java

E:\JLC OOPs Lab>java Lab261
Student2 default constructor
99      Srinivas
*/