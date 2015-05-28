package org.game.iface;

import java.util.Scanner;

/**
 * A text interface that is used to play a game of dominos.
 * Note that it implements the IDomInterface. 
 * @author Richie
 */
public class TextInterface implements IDomInterface {
	
	private Scanner input; // Used to get input from the user.
	
	/**
	 * Default Constructor
	 */
	public TextInterface(){
		this.input = new Scanner(System.in);
	}
	
	@Override
	public int packSize() {
		/*What domino pack should be created? 6 or 9?*/
		System.out.println("Which pack would you like? \"6\" or \"9\"?");
		return input.nextInt();
	}

	@Override
	public int numPlayers() {
		System.out.println("How many players today?");
		return input.nextInt();
	}

	@Override
	public String playerName() {
		System.out.println("Please enter Player's Name.");
		return input.next();
	}
	
}
