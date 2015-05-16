package org.game.model;

import java.util.List;

public class Pack 
{
	List<Domino> pack; 
	
	public Pack()
	{
		int i, k;
		
		System.out.println("creating cards");
		for(i = 0; i<=6;i++)
		{
			for(k = i; k<=6;k++)
			{
				Domino newDom = new Domino(i,k);
				pack.add(newDom); 
				
			}
		}
	}
	
}
