package org.game.model;

import java.util.ArrayList;
import java.util.List;

import org.game.iface.IDomInterface;

/**
 * Class used to play a game of dominoes.
 * @author Dwayne Patterson
 */
public class Game 
{
	
	private int numOfPlayers; // Number of players
	private int packType; // Max domino in the pack. i.e. 6 | 6 or 9 | 9. etc.
	private IDomInterface iFace; // The interface for the game.
	private List<Player> playerList; // List of the players in the game
	
	/**
	 * Default constructor makes a game with 0 players, and no
	 * prescribed pack.
	 */
	public Game(IDomInterface iFace){
		this.numOfPlayers = 0;
		this.packType = 0;
		this.iFace = iFace;
		this.playerList = new ArrayList<Player>();
	}
	
	/** 
	 * The "main" method that plays/runs the game.
	 */
	public void play() {
		
		/*What domino pack should be created? 6 or 9?*/
		packType = iFace.packSize();
		
		/*Prompt for number of players*/
		numOfPlayers = iFace.numPlayers();
		
		/* Loop to get each players name */
		for(int i = 1; i <= numOfPlayers; i++) {
			
			String name = iFace.playerName(); // Ask for the player's name.
			playerList.add(new Player(name)); // Add the player to the list.

		}
		
		/* Make a new empty board */
		Board newBoard = new Board();
		
		/* Make a new pack, based on the type the user selected */
		Pack newPack = new Pack(packType);
		
		/* Shuffle the pack */
		newPack.shuffle();
		
		/* Deal the dominos to each player in the game */
		for(Player player: playerList){
			newPack.dealHand(player, 7);
			System.out.printf("%s 's hand was dealt.\n", player.getName());
		}
			
	}
	
}
