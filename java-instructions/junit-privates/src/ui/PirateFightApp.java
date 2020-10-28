package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pirate;

public class PirateFightApp {

	private static List<Pirate> pirates = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Pirate Fight App!");
		
		// create some pirates and store in list
		pirates.add(new Pirate("Black Beard"));
		pirates.add(new Pirate("Jack Sparrow"));
		pirates.add(new Pirate("Captin Hook"));
		pirates.add(new Pirate("Long John Silver"));
		pirates.add(new Pirate("Blue Beard"));

		// call method to print stats
		printPirateStats();
		
		// simulate a fight by generating a random index
		// to pick a pirate that will lose a limb
		// total of 10 times
		
		for(int i=0; i<10; i++) {
			// pick a random index - choose a random pirate from list
			int pirateInx = generateRandomIndex();
			Pirate p = pirates.get(pirateInx);
			
			p.loseALimb();
			
			// if pirate is dead, remove them from list
			if(p.isDead()) {
				pirates.remove(p);
			}
		}
		
		// call method to print stats
		printPirateStats();
		
		System.out.println("Bye, Matey!");
	}
	
	// method to generate a random number
	private static int generateRandomIndex() {
		int r = (int)(Math.random()*pirates.size());
		return r;
	}

	// method to print states to console
	private static void printPirateStats() {
		System.out.println("***** Pirate Stats *****");
		System.out.println("Total Pirates " + Pirate.numPirates);
		System.out.println("Total Limbs Lost: " + Pirate.totalLimbsLost);
		for (Pirate p: pirates) {
			System.out.println(p);
		}
		System.out.println("************************");
	}
	
}
