package org.game.model;

import java.util.Iterator;

/**
 * This class serves as the testing framework for the classes
 * that are developed in this project.
 * <p>
 * Each method is responsible for performing tests on a specific developed class. 
 * @author Richard Walker
 *
 */
public class Tester {
	
	public static void main(String[] args) {
		
	}

	/**
	 * This method is used to test the Domino Class.
	 * @see Domino
	 */
	@SuppressWarnings("unused")
	private static void DominoClass(){
		
		System.out.println("-- Testing the Domino Class --");
		System.out.println();
		
		
		/* Make the dominos for testing */
		Domino dom1 = new Domino(5,5); // 5 | 5
		Domino dom2 = new Domino(6,4); // 6 | 4
		Domino dom3 = new Domino(); // double blank
		Domino dom4 = new Domino(5,5); // 5 | 5
		
		/* Print the dominos */
		System.out.println("This domino is " + dom1);
		System.out.println("This domino is " + dom2);
		System.out.println("This domino is " + dom3);
		
		/* Test the printVertical() method */
		dom1.printVertical();
		dom2.printVertical();
		dom3.printVertical();
		
		/* Get the total values */
		System.out.println();
		System.out.println("The total value for " + dom1 + " is " + dom1.getTotalValue());
		System.out.println("The total value for " + dom2 + " is " + dom2.getTotalValue());
		System.out.println("The total value for " + dom3 + " is " + dom3.getTotalValue());
		
		/* Test the isDouble() method */
		System.out.println();
		System.out.println(dom1 + " is a double domino " + dom1.isDouble());
		System.out.println(dom2 + " is a double domino " + dom2.isDouble());
		System.out.println(dom3 + " is a double domino " + dom3.isDouble());
		
		/* Test the isSameValue() method */
		System.out.println();
		System.out.println(dom1 + " and " + dom2 + " have the same total value " + dom1.isSameValue(dom2)); // true 
		System.out.println(dom1 + " and " + dom3 + " have the same total value " + dom1.isSameValue(dom3)); // false
		
		/* Test the equals() method */
		System.out.println();
		System.out.println("Are " + dom1 + " and " + dom1 + " are the same? " + dom1.equals(dom1)); // true 
		System.out.println("Are " + dom1 + " and " + dom2 + " are the same? " + dom1.equals(dom2)); // false
		System.out.println("Are " + dom1 + " and " + dom4 + " are the same? " + dom1.equals(dom4)); // true
		
	}
	
	/**
	 * This method is used to test the Player Class.
	 * @see Player
	 */
	@SuppressWarnings("unused")
	private static void PlayerClass(){
		System.out.println("-- Testing the Player Class --");
		System.out.println();
		
		/* Make the players for testing */
		Player richie = new Player("Richie"); 
		Player dwayne = new Player("Dwayne"); 
		
		/* Should be 2 players now */
		System.out.println("There are " + Player.getNumOfPlayers() + " players");
		
		System.out.println();
		/* Print players info */
		System.out.println(richie + "\n");
		System.out.println(dwayne);
		
		/* The hands should be empty */
		System.out.println();
		System.out.println("Is " + richie.getName() + " hand empty? " + richie.isHandEmpty()); // should be false;
		
		/* Make the dominos for testing */
		Domino dom1 = new Domino(5,5); // 5 | 5
		Domino dom2 = new Domino(6,4); // 6 | 4
		Domino dom3 = new Domino(); // double blank
		Domino dom4 = new Domino(1,0); // 1 | 0
		
		/* Prompt */
		System.out.println("Adding dominos to the players hand...");
		
		/* Add dominos to Richie hand */
		richie.addDomino(dom1);
		richie.addDomino(dom2);
		
		/* Add dominos to Dwayne hand */
		dwayne.addDomino(dom1);
		dwayne.addDomino(dom3);
		dwayne.addDomino(dom4);
		
		/* Print the hands */
		System.out.println();
		System.out.println(richie.getName() + "'s hand:\n");
		for (Domino dom : richie.getHand()){
			System.out.println(dom);
		}
		
		System.out.println();
		System.out.println(dwayne.getName() + "'s hand:\n");
		for (Domino dom : dwayne.getHand()){
			System.out.println(dom);
		}
		
		/* Dwayne should have 3 dominos in his hand */
		System.out.println();
		System.out.println("Is " + dwayne.getName() + " hand empty? " + dwayne.isHandEmpty()); // should be false;

		/* The number of dominos in each hand */
		System.out.println();
		System.out.println(richie.getName() + " has " + richie.numOfDomInHand() + " in their hand."); // should be 2
		System.out.println(dwayne.getName() + " has " + dwayne.numOfDomInHand() + " in their hand."); // should be 3
		
		/* Test the hasPlay() method */
		System.out.println();
		System.out.println(richie.getName() + " can play a matching domino with a side of " + dom1.getSide1() + "? " + richie.hasPlay(dom1.getSide1())); // should be true 
		System.out.println(dwayne.getName() + " can play a matching domino with a side of " + dom2.getSide1() + "? " + dwayne.hasPlay(dom2.getSide1())); // should be false
		System.out.println(dwayne.getName() + " can play a matching domino with a side of " + dom3.getSide1() + "? " + dwayne.hasPlay(dom3.getSide1())); // should be true
		
		/* Check hasDomino() method */
		System.out.println();
		System.out.println(dwayne.getName() + " has " + dom3 + " in his hand? " + dwayne.hasDominoInHand(dom3) ); // should be true 
		System.out.println(richie.getName() + " has " + dom3 + " in his hand? " + richie.hasDominoInHand(dom3) ); // should be false 
		
		/* The value of the hands */
		System.out.println();
		System.out.println(richie.getName() + " counts " + richie.valueOfHand()); // should be 20
		System.out.println(dwayne.getName() + " counts " + dwayne.valueOfHand()); // should be 11
		
		/* Remove double blank from Dwayne's hand */
		System.out.println("\nRemoving " + dom3 +" from " + dwayne.getName() + " hand.");
		dwayne.removeDom(1);
		
		/* Reprint Dwayne's updated hand */
		System.out.println();
		System.out.println(dwayne.getName() + "'s hand:\n");
		for (Domino dom : dwayne.getHand()){
			System.out.println(dom);
		}
		
	}
	
	/**
	 * Tester for the Pack Class
	 * @see Pack
	 */	
	@SuppressWarnings("unused")
	private static void PackClass(){
		
		System.out.println("--- Testing the domino pack class ---");
		
		/* Creates a new test pack with 28 dominos */
		System.out.println("\nMaking a pack with 28 dominos.");
		Pack testPack = new Pack();
		System.out.println(testPack);
		
		System.out.println("\nPrinting the pack.");
		
		/* Make an iterator for the dominoes in the pack */
		Iterator<Domino> domIter = testPack.getDominos().iterator();
		
		/* Get the next domino, which is the 1st domino, in the pack */
		Domino nextDom = domIter.next();
		
		/* What number does the current side of the domino have? */
		int currentSide = nextDom.getSide1();
		
		/* Print the 1st domino */
		System.out.print(nextDom + "\t");
		
		/* While the pack still has dominos in it */
		while(domIter.hasNext()){
			
			/* The next domino in the pack */
			nextDom = domIter.next();
			int nextDomSide  = nextDom.getSide1();
			
			/* If the next domino's side is different from the current side 
			 * print a new line */
			if(nextDomSide != currentSide){
				System.out.println();
				
				/* Make the current side (to be checked) 
				 * the same as the next domino's side */
				currentSide = nextDomSide;
				
			}
			
			/* Print the domino */
			System.out.print(nextDom + "\t");
			
		}
				
		/* Shuffling the pack */
		System.out.println("\n\nShuffling...");
		testPack.shuffle();
		
		/* Used to keep track of how many dominoes have been printed on the line */
		int printCount = 0;
		
		/* Print the new shuffled pack */
		for(Domino dom : testPack.getDominos()){
			
			/* Print the domino */
			System.out.print(dom + "\t");
			printCount++;
			
			/* Make a new line after 7 dominos have been printed */
			if(printCount > 6){
				System.out.println();
				printCount = 0;
			}
			
		}
		
		/* Make a pack with 9 | 9 */
		Pack testPack2 = new Pack(9);
		
		System.out.println("\nPrinting the 9 | 9 pack.");

		/* Make an iterator for the dominoes in the pack */
		domIter = testPack2.getDominos().iterator();

		/* Get the next domino, which is the 1st domino, in the pack */
		nextDom = domIter.next();

		/* What number does the current side of the domino have? */
		currentSide = nextDom.getSide1();

		/* Print the 1st domino */
		System.out.print(nextDom + "\t");
		
		/* While the pack still has dominos in it */
		while(domIter.hasNext()){
			
			/* The next domino in the pack */
			nextDom = domIter.next();
			int nextDomSide  = nextDom.getSide1();
			
			/* If the next domino's side is different from the current side 
			 * print a new line */
			if(nextDomSide != currentSide){
				System.out.println();
				
				/* Make the current side (to be checked) 
				 * the same as the next domino's side */
				currentSide = nextDomSide;
				
			}
			
			/* Print the domino */
			System.out.print(nextDom + "\t");
			
		}
		
		/* -- Testing the dealHand() method -- */
				
		/* Make a player */
		Player richie = new Player("Richie"); 
		Player dwayne = new Player("Dwayne");
		
		/* Print the current pack before dealing */
		System.out.println("\n\nReprinting the 6 | 6 pack.");
		
		/* Used to keep track of how many dominoes have been printed on the line */
		printCount = 0;
		
		/* Print the shuffled pack */
		for(Domino dom : testPack.getDominos()){
			
			/* Print the domino */
			System.out.print(dom + "\t");
			printCount++;
			
			/* Make a new line after 7 dominos have been printed */
			if(printCount > 6){
				System.out.println();
				printCount = 0;
			}
			
		}
		
		/* Print Richie's hand */
		System.out.println("\nDealing from the pack into " + richie.getName() + "'s hand.");
		testPack.dealHand(richie, 7);
		
		System.out.println("\nDealt...");
		for (Domino dom : richie.getHand()){
			System.out.print(dom + "\t");
		}
		
		/* Print Dwayne's hand */
		System.out.println("\n\nDealing from the pack into " + dwayne.getName() + "'s hand.");
		testPack.dealHand(dwayne, 5);
		
		System.out.println("\nDealt...");
		for (Domino dom : dwayne.getHand()){
			System.out.print(dom + "\t");
		}
		
		/* Print Modified Pack */
		System.out.println("\n\nReprinting the modified pack.");
		
		/* Used to keep track of how many dominoes have been printed on the line */
		printCount = 0;
		
		/* Print the new shuffled pack */
		for(Domino dom : testPack.getDominos()){
			
			/* Print the domino */
			System.out.print(dom + "\t");
			printCount++;
			
			/* Make a new line after 7 dominos have been printed */
			if(printCount > 6){
				System.out.println();
				printCount = 0;
			}
			
		}
		
		System.out.println("\n\n"+ testPack);
		
	}
	
	/**
	 * Tester for the Board Class
	 */
	@SuppressWarnings("unused")
	private static void BoardClass(){
		
		System.out.println("-- Testing the Board Class --\n");
		
		/* Make a board object */
		Board testBoard = new Board();
		
		System.out.println("Is the board empty? " + testBoard.isEmpty());
		
		/* Make dominos to added to the board */
		Domino dom1 = new Domino(5,5); // 5 | 5
		Domino dom2 = new Domino(6,4); // 6 | 4
		Domino dom3 = new Domino(6,5); // 6 | 5
		Domino dom4 = new Domino(6,6); // double 6
		Domino dom5 = new Domino(); // double blank
		
		/* Add the dominos to the board */
		System.out.println("\nAdding dominos to the board...");
		testBoard.addDominoTop(dom4, true); // [6 | 6]
		testBoard.addDominoTop(dom2, true); // [4 | 6][6 | 6]
		testBoard.addDominoBot(dom3, true); // [4 | 6][6 | 6][6 | 5]
		testBoard.addDominoBot(dom1, true); // [4 | 6][6 | 6][6 | 5][5 | 5]
		
		/* Print info about the board */
		System.out.println("\n" + testBoard);
		
		System.out.println("\nPrinting the board...");
		/* Print the board */
		System.out.println();
		testBoard.printBoardHorz();
		System.out.println();
		testBoard.printBoardVert();
		
		/* Check the available sides of the board */
		System.out.println("The playable top side is " + testBoard.getTopSide()); // Should be 6
		System.out.println("The playable bot side is " + testBoard.getBotSide()); // Should be 5
		
		/* Test domOnBoardMethod() is on the board */
		System.out.println();
		System.out.println(dom4 + " is on the board? " + testBoard.dominoOnBoard(dom4)); // should be true
		System.out.println(dom5 + " is on the board? " + testBoard.dominoOnBoard(dom5)); // should be true
		
		/* Test numOfType() method */
		System.out.println();
		System.out.println("Number of 6s on the board: " + testBoard.numOfType(6));
		System.out.println("Number of 5s on the board: " + testBoard.numOfType(5));
		System.out.println("Number of 0s on the board: " + testBoard.numOfType(0));
	}
	
}