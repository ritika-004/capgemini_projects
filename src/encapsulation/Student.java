package encapsulation;

public class Student {
	private int id;
	private String name;
	private double cgpa;
	
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	
	public void setID(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
}
