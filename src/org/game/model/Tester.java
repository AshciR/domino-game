package org.game.model;

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
		DominoClass();
	}

	/**
	 * This method is used to test the Domino Class.
	 * @see Domino
	 */
	private static void DominoClass(){
		
		System.out.println("-- Testing the Domino Class --");
		System.out.println();
		
		/* Make the dominos for testing */
		Domino dom1 = new Domino(5,5); // 5 | 5
		Domino dom2 = new Domino(6,4); // 6 | 4
		Domino dom3 = new Domino(); // double blank
		
		/* Print the dominos */
		System.out.println("This domino is " + dom1);
		System.out.println("This domino is " + dom2);
		System.out.println("This domino is " + dom3);
		
		/* Ge the total values */
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
			
	}
	
	
}
