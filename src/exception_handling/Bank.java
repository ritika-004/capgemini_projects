package exception_handling;

public class Bank {
	public static double balance=10000;
	public static void debt(double amount) throws InvalidAmountException
	{
		if(amount>balance) {
			throw new InvalidAmountException("Amount is greater than balance");
		}
		else {
			balance=balance-amount;
			System.out.println("amount debited");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
			debt(1000);
		}
		catch(InvalidAmountException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Program ended");
	}

}
