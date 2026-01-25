package inheritance;

public class DummyA {
	static String a1= "a1 variablee";
	public static void a1()
	
	{
		System.out.println("Static a1");
	}
	static{
		System.out.println("DummyA static init");
	}
	String a2="a2 variable";
	public void a2()
	{
		System.out.println("Non static a2");
	}
	{
		System.out.println("DummyA non static");
	}
	public DummyA()
	{
		System.out.println("DummyA constructor");
	}
	public static void main(String[] args) {
		System.out.println("DummyA main");
	}
}
