package encapsulation;

public class BankAccount {
	
	int accno;
	String name;
	double balance;
	
	BankAccount(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	public void details()
	{
		System.out.println("Account no.: "+accno);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
	}
	public void deposit(double amt)
	{
		if(amt>0) {
		balance+=amt;
		System.out.println("Amount of "+amt+" credited to your account "+accno);
		System.out.println("current balance : "+balance);
	}
		else {
			System.out.println("Invalid amount transaction cannot complete");
		}
	}
	
	public void withdraw(double amt)
	{
		if(amt<=balance)
		{
			balance-=amt;
			System.out.println("amount of "+amt+" debited from your account "+accno);
			System.out.println("current balance : "+balance);
		}
			else {
				System.out.println("Invalid amount transaction cannot complete");
		}
	}

}
