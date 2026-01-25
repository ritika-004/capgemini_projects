package shadowing;

public class B3 extends B2{
	int b=30;
	
	public void test3()
	{
		System.out.println("b3 method");
	}
	public void display()
	{
		System.out.println(b);//b3 variable
		System.out.println(super.b); //B2 variable
		System.out.println(((B1)this).b);//B1 variable 
		test3();
		super.test2();
		((B1)this).test1();
		
	}
	public static void main(String[] args) {
		B3 obj=new B3();
		obj.display();
		
	}

}
