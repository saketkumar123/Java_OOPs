class Lab260
{
	public static void main(String[] args)
	{
		Student1 st = new Student1();
		st.show();
		Student1 st1 = new Student1();
		st1.show();
	}
}

class Student1
{
	int sid;
	String sname;
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab260.java

E:\JLC OOPs Lab>java Lab260
0       null
0       null
*/