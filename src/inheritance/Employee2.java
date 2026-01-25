package inheritance;

public class Employee2 extends Person{
	int id;
	double salary;
	public Employee2(int age,String name,int id,double salary)
	{
		super(age,name);
		this.id=id;
		this.salary=salary;
	}
	public void displayEmp()
	{
		displayPerson();
		System.out.println(this.id);
		System.out.println(this.salary);
	}

}
