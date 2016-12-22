class Lab263
{
	public static void main(String[] args)
	{
		Student4 st1 = new Student4(99,"Sri","sri@jlc",9999999999l);
		st1.show();
		Student4 st2 = new Student4(88,"Vas","vas@jlc");
		st2.show();
		Student4 st3 = new Student4(77,"SD");
		st3.show();
		Student4 st4 = new Student4();
		st4.show();
		
	}
}

class Student4
{
	int sid;
	String sname;
	String email;
	long phone_no;
	Student4(int id,String sn,String em,long ph)
	{
		System.out.println("Student4 4-Arg constructor");
		sid = id;
		sname = sn;
		email = em;
		phone_no = ph;
	}
	Student4(int id,String sn,String em)
	{
		System.out.println("Student4 3-Arg constructor");
		sid = id;
		sname = sn;
		email = em;
	}
	Student4(int id,String sn)
	{
		System.out.println("Student4 2-Arg constructor");
		sid = id;
		sname = sn;
	}
	Student4()
	{
		System.out.println("Student4 default constructor");
	}
	void show()
	{
		System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone_no);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab263.java

E:\JLC OOPs Lab>java Lab263
Student4 4-Arg constructor
99      Sri     sri@jlc 9999999999
Student4 3-Arg constructor
88      Vas     vas@jlc 0
Student4 2-Arg constructor
77      SD      null    0
Student4 default constructor
0       null    null    0
*/