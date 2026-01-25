package Abstraction;

public abstract class Employee {
	int id;
	String name;
	
	public void employeeInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	public abstract void work();

}
