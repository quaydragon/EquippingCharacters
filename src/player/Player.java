package player;

import clothing.AbstractClothing;

/**
 * Comparable interface for the player class.
 * 
 * @author quaydragon
 *
 */
public interface Player extends Comparable<Player> {
  
  
  /**
   * Picks up an item, calls appropriate functions when called. 
   * TurnCount helps track the obsolescence of the object.
   * 
   * @param turnCount the turn the item was picked up on
   */
  void pickUpItem(AbstractClothing item);
  

  /**
   * Calls all of the important private functions that operate a turn.
   */
  void playTurn(int turnCount);
  
  



  


}
