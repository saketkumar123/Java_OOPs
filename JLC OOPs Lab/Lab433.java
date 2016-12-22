class Lab433
{
	public static void main(String[] args)
	{
		Inter1 arr[] = new B[3];
		arr[0] = new B();
		arr[1] = new B();
		arr[2] = new C();
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab433.java

E:\JLC OOPs Lab>java Lab433
Exception in thread "main" java.lang.ArrayStoreException: C
        at Lab433.main(Lab433.java:8)
        */