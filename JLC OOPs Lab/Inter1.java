interface Inter1
{
	int ab = 90;
}
class Hai implements Inter1
{
	void show()
	{
		System.out.println(super.ab);
	}
}