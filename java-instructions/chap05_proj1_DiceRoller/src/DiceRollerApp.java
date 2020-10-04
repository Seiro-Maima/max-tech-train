import java.util.Scanner;

/* Chap 5 - Project 1
 * Application will roll a pair of six-sided die
 */

public class DiceRollerApp {

	public static void main(String[] args) {
		// declare and initiate variables
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		// welcome message
		System.out.println("Dice Roller\n");	
		
		while(choice.equalsIgnoreCase("y")) {
			
			rollDie();
			
			// prompt user to enter choice
			System.out.print("\nRoll again? (y/n): ");
			choice = sc.next();
			System.out.print("\n");
			
		}		
		
		sc.close();

	}
	
	public static void rollDie(){
		
		int randNum1 = (int) (Math.random() *6) +1;
		System.out.println("Die 1: " + randNum1);

		int randNum2 = (int) (Math.random() *6) +1;
		System.out.println("Die 2: " + randNum2);

		int sum = randNum1 + randNum2;
		System.out.println("Total: " + sum);
		
		if(randNum1 == 1 && randNum2 == 1) {
			System.out.println("Snake eyes!");
		}else if(randNum1 == 6 && randNum2 == 6) {
			System.out.println("Boxcars!");
		}

	}
	
}
