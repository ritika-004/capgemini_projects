package Abstraction;

public abstract class Course {
	String name;
	public Course(String name)
	{
		this.name=name;
	}
	public void courseInfo()
	{
		System.out.println("Course name : "+name);
	}
	public abstract void coursePrice();

}
