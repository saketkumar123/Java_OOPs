class X
{
    public X(int i)
    {
        System.out.println(1);
    }
}
 
class Y extends X
{
    public Y()
    {
    	super(5);
        System.out.println(2);
    }
}