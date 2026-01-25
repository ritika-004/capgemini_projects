package inheritance;

public class Developer2 extends Employee2{
	String technology;
	public Developer2(int age,String name,int id,double salary,String technology)
	{
		super(age,name,id,salary);
		this.technology=technology;
	}
	public void display()
	{
		displayEmp();
		System.out.println(this.technology);
	}
	public static void main(String[] args) {
		Developer2 obj=new Developer2(21,"rahul",101,50000,"springboot");
		obj.display();
	}

}
