package by.bsu.inheritance;
public class Runner{
	public static void main(String[] args){
		AbstractCardAction action;
		action = new CreditCardAction();
		action.doPayment(100);
	}
}