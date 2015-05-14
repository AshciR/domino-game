package org.game.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The class is used to represent a domino game player.
 * @author Richard Walker
 *
 */
public class Player {
	
	/* Fields */
	private static int numOfPlayers = 0; // holds the total number of players playing the domino game
	private String name; // the name of the player
	private int id; // the player's ID number. i.e. Player 1, Player 2, etc.
	Collection<Domino> hand; // The player has a hand of dominos.
	
	/**
	 * Creates a new player with a given name.
	 * <p>
	 * The player will be assigned the next available ID number. 
	 * @param name the name of the player.
	 */
	public Player(String name){
		
		/* Increase the number of players by one */
		numOfPlayers++;
		
		/* Initialize the fields */
		this.name = name;
		this.id = numOfPlayers;
		
		/* Player starts with an empty hand */
		this.hand = new ArrayList<Domino>();
		
	}
	
	/**
	 * Gets the number of current players in the game.
	 * @return the current number of players in the game.
	 */
	public static int getNumOfPlayers() {
		return numOfPlayers;
	}
	
	/**
	 * Returns the player's name.
	 * @return the name of the player.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the player's ID.
	 * @return the ID of the player.
	 */
	public int getId() {
		return id;
	}
	
	/*  ----- The Hand Methods -----*/
	
	/**
	 * Gets the number of dominos in a player's hand.
	 * @return the number of dominos in the player's hand
	 */
	public int numOfCardsInHand(){
		return hand.size();
	}
	
	/**
	 * Determines if a player's hand is empty.
	 * @return true if the player has no more dominos in his/her hand.
	 */
	public boolean isHandEmpty(){
		return hand.isEmpty();
	}
	
	/**
	 * Determines if a player has a specific domino in his/her hand.
	 * @param domino the domino to check for.
	 * @return true if the player has that specific domino.
	 */
	public boolean hasDominoInHand(Domino domino){
		
		return true; //--TODO
		
	}
	
}
