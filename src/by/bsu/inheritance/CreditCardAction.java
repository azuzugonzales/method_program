package by.bsu.inheritance;

public class CreditCardAction extends AbstractCardAction{
	
	@Override
	public void doPayment(double amountPayment){
		System.out.println("complete from credit card");
	}
}