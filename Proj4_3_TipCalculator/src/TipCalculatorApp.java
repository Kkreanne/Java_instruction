import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double mealCost;
			BigDecimal total;
			BigDecimal tipAmount;
			BigDecimal tipAmt2;
			BigDecimal total2;
			BigDecimal tipAmt3;
			BigDecimal total3;
			
			System.out.print("Cost of meal: ");
			mealCost = sc.nextDouble();
			System.out.println();
			
			BigDecimal mealCostBD = new BigDecimal(mealCost);
			BigDecimal percent = new BigDecimal(0.15);
			BigDecimal percent2 = new BigDecimal(0.20);
			BigDecimal percent3 = new BigDecimal(0.25);
			
			tipAmount = percent.multiply(mealCostBD);
			total = mealCostBD.add(tipAmount);
			tipAmt2 = percent2.multiply(mealCostBD);
			total2 = mealCostBD.add(tipAmt2);
			tipAmt3 = percent3.multiply(mealCostBD);
			total3 = mealCostBD.add(tipAmt3);
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			String tipAmtString = currency.format(tipAmount);
			String totalString = currency.format(total);
			String tipAmt2String = currency.format(tipAmt2);
			String total2String = currency.format(total2);
			String tipAmt3String = currency.format(tipAmt3);
			String total3String = currency.format(total3);
			
			System.out.println("15%");
			System.out.println("Tip Amount:\t\t" + tipAmtString);
			System.out.println("Total Amount:\t\t" + totalString);
			System.out.println();
			System.out.println("20%");
			System.out.println("Tip Amount:\t\t" + tipAmt2String);
			System.out.println("Total Amount:\t\t" + total2String);
			System.out.println();
			System.out.println("25%");
			System.out.println("Tip Amount:\t\t" + tipAmt3String);
			System.out.println("Total Amount:\t\t" + total3String);
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
            choice = sc.next();
			
		}
		
		sc.close();
		System.out.println("Goodbye!");
	}

}
