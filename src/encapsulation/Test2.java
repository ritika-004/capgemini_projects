package encapsulation;

public class Test2 {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount(1,"miller",2000);
		obj.details();
		obj.deposit(500);
		obj.withdraw(1000);
	}

}
