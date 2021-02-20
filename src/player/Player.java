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
   * @param item the item to pickup
   */
  void pickUpItem(AbstractClothing item);
  

  /**
   * Calls all of the important private functions that operate a turn.
   */
  String playTurn(int turnCount);
  
  


  
  /**
   * Returns the player's attack power.
   * @return attackPower
   */
  public int getAttackPower();
  
  /**
   * Returns the player's defensive strength.
   * @return defensiveStrength
   */
  public int getDefensiveStrength();
  
  /**
   * Returns the player's hit points.
   * @return hitpoints
   */
  public int getHitPoints();
  
  
  /**
   * Subtracts damage from hit points.
   * @param damage to subtract 
   */
  public void subtractHitPoints(int damage);
  


}
