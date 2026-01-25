package Abstraction;

public class TechLead extends Employee implements Coder,Manager {
	public void work()
	{
		System.out.println("Tech lead is working");
	}
	public void writeCode()
	{
		System.out.println("Tech lead guids team");
	}
	public void manageTeam()
	{
		System.out.println("tech lead manages team");
	}

}
