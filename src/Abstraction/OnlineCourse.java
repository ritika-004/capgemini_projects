package Abstraction;

public class OnlineCourse extends Course {
	double platformCharge;
	public OnlineCourse(String name,double platformCharge)
	{
		super(name);
		this.platformCharge=platformCharge;
	}
	public void coursePrice()
	{
		System.out.println("Price : "+platformCharge);
	}


}
