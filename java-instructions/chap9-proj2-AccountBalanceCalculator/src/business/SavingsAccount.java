package business;

public class SavingsAccount extends Account {

	// instance variables
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	public void applyInterestPaymentToBalance() {
		// calculate payment before applying to balance
		monthlyInterestPayment = balance * monthlyInterestRate;
		balance += monthlyInterestPayment;
	}

}
