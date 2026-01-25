package exception_handling;

public class Student {
	private String name;
	private int age;
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setName(String name) throws InvalidNameException 
	{
		if(name == null) {
			throw new InvalidNameException("Name value is null");

		}
		else
			this.name=name;
			
	}
	public void setAge(int age)
	{
		if(age<=0)
			throw new InvalidAgeException("Age entered is invalid");
		else
			this.age=age;
	}

}
