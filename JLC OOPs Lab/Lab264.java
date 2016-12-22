class Lab264
{
	public static void main(String[] args)
	{
	
		Student5 st = new Student5();
		st.Student5(77,"SD");
		st.show();
		
	}
}

class Student5
{
	int sid;
	String sname;

	Student5(int id,String sn)
	{
		System.out.println("Student4 2-Arg constructor");
		sid = id;
		sname = sn;
	}
	Student5()
	{
		System.out.println("Student4 default constructor");
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab264.java
Lab264.java:7: error: cannot find symbol
                st.Student5(77,"SD");
                  ^
  symbol:   method Student5(int,String)
  location: variable st of type Student5
1 error
*/