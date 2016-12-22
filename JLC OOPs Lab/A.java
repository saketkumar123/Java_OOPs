package p1;

interface Test 
{
	//static int x =99;
	static class B
	{
		//static int x =88;
		void show(){
		//int x =90;
		System.out.println("OK");
		//System.out.println(Test.x);
	}
	}
	/*B b = new B();
	{
	System.out.println(b.y);
}*/
}

class A
{
	public static void main(String[] args) {
		//Test.B ref = new Test.B();
		Test.B.show();
	}
}
