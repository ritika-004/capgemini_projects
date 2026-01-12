package method;

public class Prog1 {
	public static void main(String[]args) {
		int a=9;
		demo();//method signature
		//no argument method
		test(a);
		//parameterized method
		
	}
	public static void demo()
	{
		System.out.println("demo");
	}
	public static void test(int a)
	{
		System.out.println("test");
	}


}
