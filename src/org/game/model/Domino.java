package org.game.model;

/**
 * A class used to represent a single domino.
 * @author Richard Walker
 */
public class Domino implements Comparable<Domino> {
	
	/* Fields used to represent the sides of a domino.
	 * A domino has two sides associated with it. */
	private int side1, side2;
	private boolean flipped;
	
	/**
	 * Constructor that makes a new "double blank" domino. 
	 * I.e. a domino whose both sides are 0.  
	 */
	public Domino()
	{
		this.side1 = 0;
		this.side2 = 0;
		this.flipped = false; 
	}
	
	/**
	 * 
	 * @param side1 the integer used represent the 1st side of the domino.
	 * @param side2 the integer used represent the 2nd side of the domino.
	 */
	public Domino(int side1, int side2){
		this.side1 = side1;
		this.side2 = side2;
		this.flipped = false; 
	}
	
	/* Getters for the Domino */
	
	/**
	 * Get's the number associated with the 1st side of the domino.
	 * @return the number value for the 1st side of the domino.
	 */
	public int getSide1() {
		return side1;
	}

	/**
	 * Get's the number associated with the 2nd side of the domino.
	 * @return the number value for the 2nd side of the domino.
	 */
	public int getSide2() {
		return side2;
	}
	
	/**
	 * Determines if the domino is/was flipped.
	 * @return true if the domino is flipped.
	 */
	public boolean isFlip(){
		return flipped;
	}
	
	/**
	 * Flips the domino's state.
	 */
	public void flipDom(){
		
		/* Change the flip state of the domino */ 
		flipped = !flipped;
	}
	
	/** 
	 * Gets the total value of the domino. 
	 * <p>
	 * The total value for a domino is the sum of both its sides.
	 * @return The total value of the domino. 
	 */
	public int getTotalValue(){
		return side1 + side2;
	}
	
	/**
	 * Determines if two dominos have the same total value.
	 * @param compDomino the domino you want to compare with.
	 * @return true if the two dominos have the same total value.
	 */
	public boolean isSameValue(Domino compDomino){
		
		return this.getTotalValue() == compDomino.getTotalValue();
		
	}
	
	/**
	 * Determines if the domino is a double domino.
	 * <p>
	 * A double domino is a domino whose both sides have the same value. E.g. 6 | 6.
	 * @return true if the domino is a double domino.
	 */
	public boolean isDouble(){
		return side1 == side2;
	}
	
	/** 
	 * Prints a vertical text representation of the domino.
	 * @param true, if the domino should be printed reversed.
	 */
	public void printVertical(){
		
		/* If not flipped */
		if(!flipped){
			System.out.println("---");
			System.out.println(" " + side1);
			System.out.println(" -");
			System.out.println(" " + side2);
			System.out.println("---");
		}
		/* Print in the opposite way */
		else{
			System.out.println("---");
			System.out.println(" " + side2);
			System.out.println(" -");
			System.out.println(" " + side1);
			System.out.println("---");
		}
		
		
	}
	
	/** 
	 * Prints a horizonal text representation of the domino.
	 * @param true, if the domino should be printed reversed.
	 */
	public void printHorizontal(){
		
		if(!flipped){
			System.out.print("[" + side1 + " | " + side2 + "]");
		}
		else{
			System.out.print("[" + side2 + " | " + side1 + "]");
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domino other = (Domino) obj;
		if (side1 != other.side1)
			return false;
		if (side2 != other.side2)
			return false;
		return true;
	}
	
	
	
	@Override
	public int compareTo(Domino compDom) {
		return this.getTotalValue() - compDom.getTotalValue();
	}
	
	@Override
	public String toString() {
		return "[" + side1 + " | " + side2 + "]";
	}


	

}
