package shadowing;

public class A2 extends A1{
	int a=20;
	public void message()
	{
		System.out.println("A2 message");
	}
	public void display()
	{
		System.out.println(a);//child variable
		System.out.println(super.a);
		message();//child method
		super.message();
	}
	public static void main(String[] args) {
		A2 obj=new A2();
		obj.display();
	}

}
