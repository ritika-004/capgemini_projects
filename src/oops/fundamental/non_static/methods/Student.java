package oops.fundamental.non_static.methods;

public class Student {
	int id;
	String name;
	double per;
	
	Student(int id , String name, double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	public void display()
	{
		System.out.println("Name : "+name );
		System.out.println("Student ID : "+id);
		System.out.println("Percentage : "+per );
	}

}
