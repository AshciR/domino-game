package org.game.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Class used to represent the board on which the dominoes are placed on.
 * @author Richard Walker
 */
public class Board {
	
	private List<Domino> dominos;  // The board contains a set of dominoes
	private int topSide, botSide; // The board has two playable sides
	
	/**
	 * Creates an empty board.
	 */
	public Board() {
		
		/* Make an empty list to store all the dominoes on the board */
		this.dominos = new LinkedList<Domino>(); 
		
	}
	
	/**
	 * Gets the list of all the dominoes on the board.
	 * @return a list of all the dominoes on the board.
	 */
	public List<Domino> getDominos() {
		return dominos;
	}

	/**
	 * Returns the number of the top playable side for the board.
	 * <p>
	 * E.g. If the board looks like this [6 | 6][5 | 4] the top playable side 
	 * would be 6.
	 * <p>
	 * N.B. An empty board will return negative values for it's top and bot sides.
	 * @return the number for the top side.
	 */
	public int getTopSide() {
		
		/* If the board isn't empty, return the value */
		if(!isEmpty()){
			return topSide;
		}
		else{
			return -1;
		}
	}
	
	/**
	 * Returns the number of the bot playable side for the board.
	 * <p>
	 * E.g. If the board looks like this [6 | 6][5 | 4] the bot playable side 
	 * would be 4.
	 * <p>
	 * N.B. An empty board will return negative values for it's top and bot sides.
	 * @return the number for the bot side.
	 */
	public int getBotSide() {
		
		/* If the board isn't empty, return the value */
		if(!isEmpty()){
			return botSide;
		}
		else{
			return -1;
		}
	}
	
	/**
	 * Determines if the board is empty or not.
	 * @return true if the board is empty.
	 */
	public boolean isEmpty(){
		return this.dominos.isEmpty();
		
	}
	
	/**
	 * Add a domino to the top of the board.
	 * <p>
	 * The user of this method must specify which side of the domino should
	 * be connected to the board.
	 * @param addedDom the domino to be added to the board.
	 * @param side1 true if side1 of the added domino is the side
	 * that matches the board. 
	 */
	public void addDominoTop(Domino addedDom, boolean side1){
		
		/* Add to the start of the list */
		dominos.add(0, addedDom);
		
		/* If side1 is true, that means side1 is the one that matched,
		 * therefore, side2 becomes the next available side on the board. */
		if(side1){
			topSide = addedDom.getSide2();
		}
		else{
			topSide = addedDom.getSide1();
		}
		
	}
	
	/**
	 * Add a domino to the top of the board.
	 * <p>
	 * The user of this method must specify which side of the domino should
	 * be connected to the board.
	 * @param addedDom the domino to be added to the board.
	 * @param side1 true if side1 of the added domino is the side
	 * that matches the board. 
	 */
	public void addDominoBot(Domino addedDom, boolean side1){
		
		/* Add to the end of the list */
		dominos.add(addedDom);
		
		/* If side1 is true, that means side1 is the one that matched,
		 * therefore, side2 becomes the next available side on the board. */
		if(side1){
			botSide = addedDom.getSide2();
		}
		else{
			botSide = addedDom.getSide1();
		}
		
	}
	
	/**
	 * Determines if a specific domino is on the board.
	 * @param dom the domino to be checked.
	 * @return true if the domino is on the board.
	 */
	public boolean dominoOnBoard(Domino dom){
		return dominos.contains(dom);
	}
	
	/**
	 * Returns the number of dominos on the board that match a specific type.
	 * <p>
	 * Eg. Can be used to determine how many '2's  are on the board.
	 * @param type the number of the domino. Eg. [5|4] is either a '4' domino or a '5' domino.
	 * @return an integer that tells how many dominos of that type are on the board.
	 */
	public int numOfType(int type){
		
		/* Counter to keep track of how many dominos match the type */
		int numOfType = 0;
		
		/* Check every domino on the board */
		for(Domino dom : dominos){
			
			/* If either side of the domino on the board is equal
			 * to the type, then increment the type counter */
			if( (dom.getSide1() == type) || (dom.getSide2() == type) ){
				numOfType++;
			}
			
		}
		
		return numOfType;
		
	}
	
}
