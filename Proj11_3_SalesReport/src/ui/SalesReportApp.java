package ui;

import java.text.NumberFormat;

import util.Console;

public class SalesReportApp {

	public SalesReportApp() {
		// empty constructor
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Sales Report Application!\n");
		
		double[][] sales = {
			    {1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
			    {1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
			    {1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
			    {1105.0, 4102.0, 2391.0, 1576.0}  // Region 4
			};
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		Console.println("Region\t\tQ1\t\tQ2\t\tQ3\t\tQ4");
		Console.println("------\t\t--\t\t--\t\t--\t\t--");
		for (int i = 0; i < sales.length; i++) {
			System.out.print((i+1) + "\t\t");
			 for (int j = 0; j < 4; j++) {
				 System.out.print(currency.format(sales[i][j]) + "\t");
	         }
	         System.out.println();
		}
		
		Console.println("\nSales by region:");
        for (int i = 0; i < sales.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < 4; j++) {
                sum += sales[i][j];
            }
            Console.println("Region " + (i+1) + ": " + currency.format(sum));
        }

        Console.println("\nSales by quarter:");
        for (int j = 0; j < 4; j++) {
            double sum = 0.0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i][j];
            }
            Console.println("Q" + (j+1) + ": " + currency.format(sum));
        }

        double totalSales = 0.0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < 4; j++) {
                totalSales += sales[i][j];
            }
        }
        Console.println("\nTotal sales: " + currency.format(totalSales));
	}
}