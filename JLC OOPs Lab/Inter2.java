interface Inter2
{
	int ab = 90;
}
class Hello
{
	String ab ="JLC";
}
class Hai extends Hello implements Inter2
{
	void show()
	{
		System.out.println(super.ab);
		System.out.println(Inter2.ab);
	}
}
class Lab
{
	public static void main(String[] args)
	{
		Inter2 in = new Hai();
		in.show();
	}
}