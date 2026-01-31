package tree_Set;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override 
	public String toString()
	{
		return "id :"+ id+ ", name :"+ name+ " ,salary : "+ salary;
	}
	
	public int compareTo(Employee e)
	{
		if(this.salary> e.salary)
			return -1;
		else if(this.salary < e.salary)
			return 1;
		else {
			return this.name.compareTo(e.name);
		}
			
	}
	

}
