package Abstraction;

public class Developer extends Employee implements Coder{
	public void work()
	{
		System.out.println("Developer is working");
	}
	public void writeCode()
	{
		System.out.println("Developer writes code");
	}

}
