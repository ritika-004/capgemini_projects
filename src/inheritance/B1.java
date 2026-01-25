package inheritance;

public class B1 extends A1 {
	int b=200;
	public void b()
	{
		System.out.println("b()");
	}
	public B1()
	{
		System.out.println("b constructor");
		
	}
	{
		System.out.println(" b non static init");
	}

}