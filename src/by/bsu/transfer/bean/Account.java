package by.bsu.transfer.bean;
public class Account {
	private long id;
	private double amount;
	private double asset;

	public Account() {
		super();
	}
	public Account(long id) {
		super();
		this.id = id;
	}
	public Account(long id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount (double amount) {
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void addAmount(double amount) {
		this.amount += amount;
	}

	public void setAsset(double asset) {
		this.asset = asset;
	}

	public void addAsset(double transactionAmount) {
	}
}