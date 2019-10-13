package ui;

import java.text.NumberFormat;

import util.Console;

public class BattingStatisticsApp {
	
	public static void main(String[] args) {
				
		Console.println("Welcome to the Batting Average Calculator!\n");
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(3);

		int num = Console.getInt("Enter number of times at bat: ", -1, Integer.MAX_VALUE);
		Console.println();
		int[] timesAtBat = new int[num];
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Console.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			
			for (int i = 0; i < timesAtBat.length; i++) {
				timesAtBat[i] = Console.getInt("Result for at bat " + i + ": ", -1, timesAtBat.length);
			}
			
			int sum = 0;
			int sum2 = 0;
			for (int hits : timesAtBat) {
				if(hits > 0) {
					sum++;
				}
				sum2 += hits;
			}
			Console.println("\nBatting average: " + nf.format((double)sum/(double)timesAtBat.length));
			Console.println("Slugging percent: " + nf.format((double)sum2/(double)timesAtBat.length));
			
			choice = Console.getString("Another Player? (y/n): \n");
			Console.println("Thanks for playing!");
			
		}
	}	
}
