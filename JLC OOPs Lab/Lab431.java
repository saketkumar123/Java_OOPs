interface Inter1{}
class A implements Inter1{}
class B extends A{}
class C extends A{}
class Lab431
{
	public static void main(String[] args)
	{
		Inter1 arr[] = new Inter1[3];
		arr[0] = new A();
		arr[1] = new B();
		arr[2] = new C();
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}


/*
Output
======

E:\JLC OOPs Lab>javac Lab431.java

E:\JLC OOPs Lab>java Lab431
A@19e0bfd
B@139a55
C@1db9742
*/