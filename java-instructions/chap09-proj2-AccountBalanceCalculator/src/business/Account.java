package business;

public class Account implements Balanceable, Withdrawalable, Depositable {

	private double balance;
	
	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

	
}
