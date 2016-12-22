class Lab225
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		c1.show();
		Customer c2 = new Customer();
		c2.cid = 99;
		c2.cname = "Sri";
		c2.phone = 657999999;
		c2.show();
	}
}
class Customer
{
	int cid;
	String cname;
	long phone;
	void show()
	{
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(phone);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab225.java

E:\JLC OOPs Lab>java Lab225
0
null
0
99
Sri
657999999
*/