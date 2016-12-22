interface Inter2
{
	int ab = 90;
}
class Hello implements Inter2
{
	String ab ="JLC";
}
class Hai extends Hello
{
	void show()
	{
		System.out.println(super.ab);
		//System.out.println(Inter2.ab);
	}
}
class Lab
{
	public static void main(String[] args)
	{
		Hai h = new Hai();
		h.show();
	}
}