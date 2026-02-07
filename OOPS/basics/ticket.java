package basics;

public class ticket {
	int id;
	String name;
	String passType;
	String travelClass;
	private double fare;
	
	public void setFare(int fare)
	{
		this.fare=fare;
	}
	
	public double getFare()
	{
		return fare;
	}

}
