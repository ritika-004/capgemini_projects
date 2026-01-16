package encapsulation;

public class demo {
	private int a;
	//set value here or read value
	
	//method write design setter method
	// read the method -- > getter method
	private demo()
	{
		
	}
	public int getValueA()
	{
		return a;
	}
	public void set(int a)
	{
		this.a=a; 
	}
	//factory method
	static demo object;//null
	public static demo getA()
	{
		if(object==null)
		object= new demo();
		return object;
	}
	


}
