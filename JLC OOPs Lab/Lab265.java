class Lab265
{
	public static void main(String[] args)
	{
	
		Student6 st = new Student6();
		st.Student6(77,"SD");
		st.show();
		//Student6 st = new Student6(88,"MK");
	}
}

class Student6
{
	int sid;
	String sname;

	void Student6(int id,String sn)
	{
		System.out.println("Student6 2-Arg constructor");
		sid = id;
		sname = sn;
	}
	Student6()
	{
		System.out.println("Student6 default constructor");
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}

/*
When not commented 8th line;

Output
======


E:\JLC OOPs Lab>javac Lab265.java
Lab265.java:6: error: constructor Student6 in class Student6 cannot be applied to given types;
                Student6 st = new Student6(77,"SD");
                              ^
  required: no arguments
  found: int,String
  reason: actual and formal argument lists differ in length
Lab265.java:8: error: variable st is already defined in method main(String[])
                Student6 st = new Student6(88,"MK");
                         ^
Lab265.java:8: error: constructor Student6 in class Student6 cannot be applied to given types;
                Student6 st = new Student6(88,"MK");
                              ^
  required: no arguments
  found: int,String
  reason: actual and formal argument lists differ in length
3 errors
*/



/*
After commented 8th line

Output
======

E:\JLC OOPs Lab>javac Lab265.java

E:\JLC OOPs Lab>java Lab265
Student6 default constructor
Student6 2-Arg constructor
77      SD
*/