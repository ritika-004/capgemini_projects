package inheritance;

public class Demo {
	
	public Demo(double d)
	{
		this();
		System.out.println("demo double d");
	}
	public Demo()
	{
		this(10);
		System.out.println("demo");
	}
	public Demo(int a)
	{
		System.out.println("demo int a");
	}
	public static void main(String[] args) {
		Demo d=new Demo(10.50);
	}

}
