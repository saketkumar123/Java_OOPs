class Lab312
{
	public static void main(String[] args)
	{
		Hello48 h = new Hello48();
		h.sum(new int[0]);
		h.sum(new int[]{12,34,54});
		h.sum(new int[]{10,20,50,30});
		//h.sum();
		//h.sum(12,34,54);
		//h.sum(10,20,50,30);
	}
}
class Hello48
{
	void sum(int arr[])
	{
		System.out.println("--sum(int[])");
		System.out.println("Length: "+arr.length);
		int s = 0;
		for(int a:arr)
		{
			s = s+a;
		}
		System.out.println("Sum is: "+s);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab312.java

E:\JLC OOPs Lab>java Lab312
--sum(int[])
Length: 0
Sum is: 0
--sum(int[])
Length: 3
Sum is: 100
--sum(int[])
Length: 4
Sum is: 110
*/