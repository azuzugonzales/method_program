package by.bsu.com.transfer;
import by.bsu.com.transfer.bean.Account;
public class Runner {
	public static void main(String[] args) {
		Account from = new Account(78031864L, 258.5);
		Account to = new Account(58510009L, 12.1);
		TransferAction action = new TransferAction(52.0);
		boolean complete = action.transferIntoAccount(from, to);
		if (complete) {
			System.out.println("Summa: " + action.getTransactionAmount() + " send uspeshno");
			System.out.print("In count client ID = " + to.getId());
			System.out.println(" nahoditsja summa: " + to.getAmount());
		} else {
			System.out.println("Transaction not complete.");
			System.out.print("In count client ID = " + from.getId());
			System.out.println(" nedostatochno sredstv.");
		}
	}
}