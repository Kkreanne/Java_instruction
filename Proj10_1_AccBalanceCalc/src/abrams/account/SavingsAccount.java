package abrams.account;

public class SavingsAccount extends Account {

	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	public SavingsAccount() {
	}

	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}
	
	public void applyPaymentToBalance() {
		// assumes monthlyInterestPayment = balance * monthlyInterestRate
		this.monthlyInterestPayment = balance * monthlyInterestRate;
		this.balance += monthlyInterestPayment;
	}
	
	public double getMothlyInterestPayment () {
		return monthlyInterestPayment;
	}

}
