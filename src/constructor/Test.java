package constructor;

public class Test {
	
	public static void demo(Test obj)
	{
		System.out.println("demo()");
		System.out.println(obj);
		obj.test();
	}
	public static void main(String[] args) {
		demo(new Test());
		//demo(null);//null pointer exception
	}
	public void test()
	{
		System.out.println("test()");
	
	}

}
