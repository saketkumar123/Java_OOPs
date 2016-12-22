public class A1
{
    static int i = 10, j = 20;
 
    int m = 30, n = 40;
 
    public static void main(String[] args)
    {
        A1 a1 = new A1();
 
        A1 a2 = new A1();
 
        a1.i = 100;
 
        System.out.println(a2.i);
 
        a2.j = 200;
 
        System.out.println(a1.j);
 
        a1.m = 300;
 
        System.out.println(a2.m);
 
        a2.n = 400;
 
        System.out.println(a1.n);
    }
}