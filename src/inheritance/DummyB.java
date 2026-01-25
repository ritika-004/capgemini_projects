package inheritance;

public class DummyB extends DummyA {
	static String b1= "b1 variablee";
	public static void b1()
	
	{
		System.out.println("Static b1");
	}
	static{
		System.out.println("DummyB static init");
	}
	String b2="b2 variable";
	public void b2()
	{
		System.out.println("Non static ab");
	}
	{
		System.out.println("DummyB non static");
	}
	public DummyB()
	{
		System.out.println("DummyB constructor");
	}
	public static void main(String[] args) {
		DummyB obj=new DummyB();
		System.out.println("main DummyB");
		System.out.println(a1);
		a1();
		System.out.println(obj.a2);
		obj.a2();

	}


}
