package oops.fundamental.non_static;

public class Test {
	public static void main(String[]args)
	{
		Person obj=new Person("A", 20, "male");
		
		Person obj3=new Person("B", 22, "female");
		
	    obj.display();
		
		
		obj3.display();
	}

}
