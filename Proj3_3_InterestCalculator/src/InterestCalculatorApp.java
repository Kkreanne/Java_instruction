import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Interest Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double loanAmount, interestRate, interest = 0.0;			
			
			System.out.print("Enter Loan Amount: ");
			loanAmount = sc.nextDouble();
							
			System.out.print("Enter Interest Rate: ");
			interestRate = sc.nextDouble();
			
			BigDecimal loanAmountBD = new BigDecimal(loanAmount);
			BigDecimal interestRateDB = new BigDecimal(interestRate);
			
			interest = loanAmountBD.multiply(interestRateDB).doubleValue();
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			currency.setMaximumFractionDigits(2);
			percent.setMaximumFractionDigits(3);
			
			String loanAmtString = currency.format(loanAmount);
			String interestRateString = percent.format(interestRate);
			String interestString = currency.format(interest);
			
			System.out.println("Loan Amount:\t\t" + loanAmtString);
			System.out.println("Interest Rate:\t\t" + interestRateString);
			System.out.println("Interest:\t\t" + interestString);
			
			System.out.print("Continue? (y/n): ");
            choice = sc.next();
			
		}
		System.out.println("Bye");
		sc.close();

	}

}
