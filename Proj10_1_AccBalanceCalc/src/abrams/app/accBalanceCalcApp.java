package abrams.app;
import java.text.NumberFormat;

import abrams.account.Account;
import abrams.account.CheckingAccount;
import abrams.account.SavingsAccount;
import abrams.presentation.Console;

public class accBalanceCalcApp {

	public accBalanceCalcApp() {
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Account Balance Calculator!\n");
		
		String choice = "y";
		CheckingAccount ca = new CheckingAccount(1000, 1);
		SavingsAccount sa = new SavingsAccount(1000, .01);
		
		System.out.println("Starting Balances:");
		printAccountBalances(ca, sa);
		System.out.println();
		
		System.out.println("Enter transactions for the month.\n");
		while (choice.equalsIgnoreCase("y")) {
			String txn = Console.getString("(W)ithdrawal or (D)eposit?  (w/d): ");
			String acct = Console.getString("(C)hecking or (S)avings?  (c/s): ");
			double amt = Console.getDouble("Amount? ", 0, Double.POSITIVE_INFINITY);
			System.out.println();
			
			Account a = null;
			if (acct.equalsIgnoreCase("c")) {
				a = ca;
			} else if (acct.equalsIgnoreCase("s")) {
				a = sa;
			}
			
			if (txn.equalsIgnoreCase("w")) {
				a.withdraw(amt);
			} else if (txn.equalsIgnoreCase("d")) {
				a.deposit(amt);
			}
			
            choice = Console.getString("Continue? \n");
		} 
		// apply monthly payment and fee
		sa.applyPaymentToBalance();
		ca.subtractMonthlyFee();
		
		System.out.println("Monthly Payments and Fees:");
		System.out.println("Checking Fee: " + ca.getMonthlyFee());
		System.out.println("Savings Interest Payment: " + sa.getMothlyInterestPayment());
		System.out.println();
		
		System.out.println("Final Balances:");
		printAccountBalances(ca, sa);
		System.out.println();
		System.out.println("Bye!");
	}
	
	private static void printAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));
		
	} 
}
