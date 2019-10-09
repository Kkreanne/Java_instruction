package abrams.account;

public class CheckingAccount extends Account {
	
	private double monthlyFee;
	
	public CheckingAccount() {
	}

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFee() {
		//this.setBalance(getBalance() - monthlyFee);  balance is private in Account class
		this.balance -= monthlyFee; // line 15 could be this.balance -= monthlyFee
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	} 

}
