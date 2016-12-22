class Lab432
{
	public static void main(String[] args)
	{
		Inter1 arr[] = null;
		arr= new B[3];
		arr[0] = new A();
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab432.java

E:\JLC OOPs Lab>java Lab432
Exception in thread "main" java.lang.ArrayStoreException: A
        at Lab432.main(Lab432.java:7)
        */