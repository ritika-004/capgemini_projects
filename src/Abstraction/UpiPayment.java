package Abstraction;

public class UpiPayment extends Payment {
	String upiApp;
	public UpiPayment(double amount,String upiApp)
	{
		super(amount);
		this.upiApp= upiApp;
	}
	 //override
	public void  paymentInfo()
	{
		super.paymentInfo();
		System.out.println("UPI App :"+ upiApp);
		
	}
	
	public void makePayment()
	{
		System.out.println("Payment is done using UPI app");
	}

	

}
