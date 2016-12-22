class Lab396
{
	public static void main(String[] args)
	{
		Person pob = null;
		pob = new Student();
		pob.reading();
		pob = new Employee();
		pob.working();
	}
}

/*
Output
======

E:\JLC OOPs Lab>javac Lab396.java
Lab396.java:7: error: cannot find symbol
                pob.reading();
                   ^
  symbol:   method reading()
  location: variable pob of type Person
Lab396.java:9: error: cannot find symbol
                pob.working();
                   ^
  symbol:   method working()
  location: variable pob of type Person
2 errors
*/