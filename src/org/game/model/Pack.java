package org.game.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pack 
{
	List<Domino> pack; 
	
	
	/*Default constructor for pack of 28*/
	public Pack()
	{
		int i, k;
		pack = new ArrayList<Domino>();//Creates pack as an ArrayList of Dominos
		System.out.println("creating cards");
		
		/*Following nested loops create Domino cards*/
		for(i = 0; i<=6;i++)
		{
			for(k = i; k<=6;k++)
			{
				Domino newDom = new Domino(i,k);
				pack.add(newDom); 
				
			}
		}
	}


	/*Returns pack */
	public List<Domino> getDominos() 
	{
		return pack;
	}
	
	/*Shuffles pack of Dominos*/
	public void shuffle()
	{
		Collections.shuffle(pack);
	}
	
	/*Returns size of pack*/
	public int packSize()
	{
		return pack.size();
	}
	
	public void dealPackSeven()
	{
		
	}
	
	public void dealHand(Player player1)
	{
		for(int i = 0; i < 7; i++)
			{
				player1.addDomino(pack.remove(0));
			}
	}
	
	
}
