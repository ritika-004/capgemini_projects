package Abstraction;

public class OnlinePaidCourse extends OnlineCourse{
	double courseFee;
	public OnlinePaidCourse(String name,double platformCharge,double courseFee)
	{
		super(name,platformCharge);
		this.courseFee=courseFee;
	}
	public void coursePrice()
	{
		double p= platformCharge+courseFee;
		System.out.println("Price : "+ p);
	}


}
