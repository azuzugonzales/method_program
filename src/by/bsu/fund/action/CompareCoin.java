package by.bsu.fund.action;
import by.bsu.fund.bean.Coin;
public class CompareCoin {
	public void compareDiameter(Coin first, Coin second) {
		double delta = first.getDiameter() - second.getDiameter();
		if (delta > 0) {
			System.out.println("First coin larger second on " + delta);
		} else if (delta == 0) {
			System.out.println("Coins have the same diameter");
		} else {
			System.out.println("Second coin larger first on " + -delta);
		}
	}
}