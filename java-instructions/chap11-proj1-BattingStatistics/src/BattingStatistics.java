/* Chap 11 - Project 1
 * Application will calculate batting statistics for baseball players
 */

import java.text.DecimalFormat;

public class BattingStatistics {

	public static void main(String[] args) {

		// welcome message
		System.out.println("Welcome to the Batting Average Calculator");
		
		String userInput = "y";
		
		while(userInput.equalsIgnoreCase("y")) {
		
			// prompt user for input
			int numBatTimes = Console.getInt("\nEnter number of times at bat: ", 0, 31);
			
			// call method to perform calculations
			calculateBattingStat(numBatTimes);
			
			userInput = Console.getString("Another player? (y/n) ");
		}
		
		// farewell message
		System.out.println("\nBye!");
		
	}

	// module that will calculate the batting statistics
	private static void calculateBattingStat(int numBatTimes) {
		
		// display only 3 decimal digits
		DecimalFormat df3 = new DecimalFormat("0.000");
		
		// use array to store the at-bat results for each player
		int[] batResult = new int[numBatTimes];
		double battingAvg = 0.0;
		double slugPct = 0.0;
		
		System.out.println("\n[0 - out] [1 = single] [2 = double] [3 = triple] [4 = home run]");

		for(int i = 0; i < numBatTimes; i++) {	
			
			
			System.out.print("Result for at-bat " + i + ":");
			
			batResult[i] = Console.getInt(" ", -1, 5); 	// HOW TO ADD[i] when printing?
			
			if(batResult[i] > 0) {
				battingAvg++;
				slugPct += batResult[i];
			}			
		}
		
		// perform calculations
		battingAvg = battingAvg/numBatTimes;
		slugPct = slugPct/numBatTimes;
		
		// output results to user
		System.out.println("\nBatting average: " + df3.format(battingAvg));
		System.out.println("Slugging percent: " + df3.format(slugPct) + "\n");
	}

}
