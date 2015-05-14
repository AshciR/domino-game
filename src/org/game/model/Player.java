package org.game.model;

import java.util.ArrayList;
import java.util.List;

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
	List<Domino> hand; // The player has a hand of dominos.
	
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
	
	/**
	 * Returns the list of dominos in the player's hand.
	 * @return the dominos in this player's hand.
	 */
	public List<Domino> getHand(){
		return this.hand;
	}
	
	/*  ----- The Hand Methods -----*/
	
	/**
	 * Gets the number of dominos in a player's hand.
	 * @return the number of dominos in the player's hand
	 */
	public int numOfDomInHand(){
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
	 * Adds a domino to the player's hand.
	 * @param domino the domino to be added to the player's hand.
	 */
	public void addDomino(Domino domino){
		this.hand.add(domino);
	}
	
	/**
	 * Removes a domino from the player's hand. It returns the removed domino.
	 * @param index the index position of the domino in the hand to be returned.
	 * @return the domino that is removed from the hand.
	 */
	public Domino removeDom(int index){
		
		/* Get the domino to be returned */
		Domino domino = hand.get(index);
		
		/* Remove it from the hand */
		hand.remove(index);
		
		/* Return the domino */
		return domino;
		
	}
	
	/**
	 * Determines if a player has a specific domino in his/her hand.
	 * @param domino the domino to check for.
	 * @return true if the player has that specific domino.
	 */
	public boolean hasDominoInHand(Domino domino){	
		return hand.contains(domino);	
	}
	
	/** 
	 * Determine if the player has a domino in his/her hand that 
	 * can be played on the board.
	 * @param the side of the domino on the board to be checked.
	 * @return true if the player has a playable domino.
	 */
	public boolean hasPlay(int side){
		
		for (Domino domInHand : hand){
			
			/* the board domino side (int) equals the hand domino side 1 or side 2 */
			if( (side == domInHand.getSide1()) || (side == domInHand.getSide2()) ){
				return true;
			}
			
		}
		
		/* Checked the entire hand, there were no matches */
		return false;
		
	}
	
	/**
	 * Returns the total value of all the dominos in the player's hand. 
	 * @return the total value of all the dominos in the player's hand.
	 */
	public int valueOfHand(){
		
		int total = 0;
		
		/* Sum the value for each domino in the hand */
		for(Domino domino : hand){
			total = total + domino.getTotalValue();
		}
		
		return total;
		
	}

	@Override
	public String toString() {
		return "Player #: " + getId() + "\n" +
			   "Player name: " + getName() + "\n" +
			   "Num of dominos in hand: " + numOfDomInHand();
	}
	
	
	
}
