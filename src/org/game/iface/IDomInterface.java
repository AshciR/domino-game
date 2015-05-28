package org.game.iface;

import org.game.model.Player;

/**
 * Interface for the domino used to get data/show data to the user.
 * <p>
 * Any interface for the domino game should implement this interface.
 * @author Richie
 */
public interface IDomInterface {
	
	/**
	 * Used to get the pack size from the user. i.e. double 6 or double 9.
	 * @return the maximum domino in the pack.
	 */
	public int packSize();
	
	/**
	 * Used to get the number of players for the game.
	 * @return the number of players in the game.
	 */
	public int numPlayers();
	
	/**
	 * Used to get the player's name.
	 * @return the String representation of the player's name.
	 */
	public String playerName();
	
	/**
	 * Tells the players that his hand was dealt.
	 */
	public void handDealt(Player player);
}
