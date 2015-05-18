package org.game.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class used to represent a pack of dominoes
 * @author Dwayne Patterson
 */
public class Pack {
	
	/* List used to hold the all the dominoes in the pack */
	private List<Domino> pack; 
	private int originalSize; // the original size of the pack.
	
	/**
	 * Default constructor that creates a pack with 28 dominoes.
	 * <p>
	 * Note, a standard pack starts with 0 | 0, and goes to 6 | 6.
	 */
	public Pack() {
		
		/* Create a empty list for the domino pack */
		pack = new ArrayList<Domino>();
		
		/* 2-D Loop that creates the 28 dominoes */
		for(int i = 0; i <= 6; i++) {
			
			for(int k = i; k <= 6; k++) {
				Domino newDom = new Domino(i,k);
				pack.add(newDom); 
				
			}
			
		}
		
		originalSize = pack.size();
		
	}
	
	/**
	 * Default constructor that creates a pack with 28 dominoes.
	 * <p>
	 * Note, a standard pack starts with 0 | 0, and goes to 6 | 6.
	 * @param highestCard an integer which represents the highest card in the pack.
	 * I.e. a 9 would mean that the pack starts at 0 | 0 and ends at 9 | 9.
	 */
	public Pack(int highestCard) {
		
		/* Create a empty list for the domino pack */
		pack = new ArrayList<Domino>();
		
		/* 2-D Loop that creates the 28 dominoes */
		for(int i = 0; i <= highestCard; i++)
		{
			for(int k = i; k <= highestCard; k++)
			{
				Domino newDom = new Domino(i,k);
				pack.add(newDom); 
				
			}
		}
		
	}
	
	/**
	 * Used to get all the dominoes that are currently in the pack.
	 * @return the a list that contains all the dominoes that are in the pack.
	 */
	public List<Domino> getDominos() {
		return pack;
	}
	
	/** 
	 * Used to shuffle the pack of dominoes.
	 */
	public void shuffle() {
		Collections.shuffle(pack);
	}
	
	/**
	 * Returns the number of dominoes that are currently in the pack.
	 * @return the size current number of dominoes in the pack.
	 */
	public int packSize() {
		return pack.size();
	}
	
	/**
	 * Returns the number of dominoes that were in the pack.
	 * @return the original size of domino's pack.
	 */
	public int orgPackSize() {
		return originalSize;
	}
	
	/**
	 * Removes a given number of dominoes from the pack, and put places it
	 * into a specific player's hand.
	 * @param player the player to whom the dominoes should be dealt to.
	 * @param numDealt the number of dominoes to be dealt. 
	 */
	public void dealHand(Player player, int numDealt) {

		for(int i = 0; i < numDealt; i++) {
			
			/* Take the first domino from the pack,
			 * and put it in the given player's hand.*/
			player.addDomino(pack.remove(0));
			
		}
		
	}
	
}
