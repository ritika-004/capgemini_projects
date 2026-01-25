package inheritance;

public class TestB extends TestA{
	static int a=10;
	public TestB()
	{
		
		super(a);
		System.out.println("Test b");
	}
	public static void main(String[] args) {
		TestB obj=new TestB();
	}

}
