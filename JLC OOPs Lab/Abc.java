package Hello.xyz;
public class Abc{
	protected void m1(){
		System.out.println("Abc -> m1()");
	}
}
class Ab extends Abc{
	void m1(){
		System.out.println("Ab -> m1()");
	}
}