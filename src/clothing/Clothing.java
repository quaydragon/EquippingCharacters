package clothing;


/**
 * Creates framework for comparable clothing classes.
 * 
 * @author quaydragon
 *
 */
public interface Clothing extends Comparable<Clothing> {
  
  int currentPower = 0;

  /**
   * Returns the power of the item has based upon its obsolescence. 
   * 
   * @param turn what turn the player is on
   * @return the power of the item at this time
   */
  int turnObsolescence(int turn);
  
  /**
   * Returns whether the clothing is
   * used for attack or defense.
   * 
   * @return whether the clothing is used for attack or defense
   */
  AttackOrDefense getType();
  
  /**
   * Get whether an item is cursed of not. 
   * 
   * @return boolean of whether an item is cursed
   */
  boolean getCursed();
  
  /**
   * Returns the name of the object.
   * 
   * @return String of the name of the object
   */
  String getName();
  
  /**
   * Get how much power the item has.
   * 
   * @return int of how powerful the item is
   */
  int getPower();
  
  
 



}
