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
	List<Domino> pack; 
	
	/**
	 * Default constructor that creates a pack with 28 dominoes.
	 * <p>
	 * Note, a standard pack starts with 0 | 0, and goes to 6 | 6.
	 */
	public Pack() {
		
		/* Create a empty list for the domino pack */
		pack = new ArrayList<Domino>();
		
		/* 2-D Loop that creates the 28 dominoes */
		for(int i = 0; i <= 6; i++)
		{
			for(int k = i; k <= 6; k++)
			{
				Domino newDom = new Domino(i,k);
				pack.add(newDom); 
				
			}
		}
		
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
	
}
