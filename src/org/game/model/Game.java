package org.game.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		/*What domino pack should be created? 6 or 9?*/
		System.out.println("Which pack would you like? \"6\" or \"9\"");
		int packType = input.nextInt();
		
		/*Prompt for number of players*/
		System.out.println("How many players today?");
		int playerNum = input.nextInt();
		
		ArrayList<Player> newPlayers = new ArrayList<Player>();
		
		for(int i = 1; i<=playerNum;i++)
		{
			System.out.println("Please enter Player Name");
			String name = input.next();
			newPlayers.add(new Player(name));
		}
		
		Board newBoard = new Board();
		Pack newPack = new Pack(packType);
		
		newPack.shuffle();
		for(Player player: newPlayers)
		{
			newPack.dealHand(player, 7);
			System.out.printf("%s 's hand dealt\n", player.getName());
		}
	}
}
