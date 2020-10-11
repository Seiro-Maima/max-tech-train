package business;

public class Account implements Withdrawable, Balanceable, Depositable {

	// instance variable
	protected double balance;

	// constructor
	public Account() {
		super();
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void depoosit(double amount) {
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
