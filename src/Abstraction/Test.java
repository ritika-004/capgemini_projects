package Abstraction;

public class Test {
	public static void main(String[] args) {
		Payment p=new CreditCard(5000,"SBI");
		p.paymentInfo();
		p.makePayment();
		
		Payment p2=new UpiPayment(2000,"Google Pay");
		p2.paymentInfo();
		p2.makePayment();
	}

}
