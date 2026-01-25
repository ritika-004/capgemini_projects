package Abstraction;

public class CreditCard extends Payment {
	String creditCompany;
	public CreditCard(double amount,String creditCompany)
	{
		super(amount);
		this.creditCompany=creditCompany;
	}
	
	//override
	public void  paymentInfo()
	{
		super.paymentInfo();
		System.out.println("company :"+ creditCompany);
		
	}
	
	public void makePayment()
	{
		System.out.println("Payment is done using credit cards");
	}

}
