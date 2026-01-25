package inheritance;

public class Developer extends Employee1 {
	String technology;
	public Developer(int id,String name,double salary,String technology)
	{
		super(id,name,salary);
		this.technology=technology;
	}
	public void display()
	{
		displayEmp();
		System.out.println(this.technology);
	}
	public static void main(String[] args) {
		Developer d=new Developer(101,"jatin",50000,"Springboot");
		d.display();
	}

}
