package abrams.account;
import abrams.interfaces.Balancable;
import abrams.interfaces.Depositable;
import abrams.interfaces.Withdrawable;

public class Account implements Depositable, Withdrawable, Balancable {
	
	protected double balance;

	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

}
