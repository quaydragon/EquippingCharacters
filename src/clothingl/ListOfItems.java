package clothingl;

import clothing.AbstractClothing;

/**
 * This interface is used to track the items as a list of nodes.
 * @author quaydragon
 *
 */
public interface ListOfItems {
  

  /**
   * Judges whether or not the item can be added immediately.
   * Cannot have more than one head item.
   * No more than 2 foot wear items.
   * No more than 10 hand items.
   * If too many items it is sent through a comparison.
   * 
   * @param item in question of adding
   * @return a number judgement 
   */
  int pickUpItem(AbstractClothing item);
  
  /**
   * Updates on the terms of item obsolescence.
   * @param turnCount the turn in order to judge how worn out the item is
   */
  void updateItems(int turnCount);
  
  

  
  /**
   * Returns the defensive strength power of all of the items.
   * 
   * @return defensive strength of items
   */
  int getDefensiveStrength();
  
  /**
   * Returns the attack power of all of the items. 
   * @return attack power of items
   */
  int getAttackPower();
  
  /**
   * A determining function on whether or not an item will be dropped.
   * @param item whose strength must be judged
   */
  void compareItemStrength(AbstractClothing item);

  /**
   * The amount of headgear the player is wearing. Used for limits. 
   * @return int headgear count
   */
  int headGearNumber();
  
  /**
   * The amount of foot wear the player is wearing. Used for limits. 
   * @return int foot wear count
   */
  int footWearNumber();
  
  /**
   * The amount of hand gear the player is wearing.
   * 
   * @return int hand gear count
   */
  int handGearNumber();
  
  /**
   * Returns the string of all the foot wear.
   * @return string of foot wear
   */
  String footWearString();
  
  /**
   * Returns the string of  head gear.
   * @return string of head gear
   */
  String headGearString();
  
  /**
   * Returns the string of all the jewelry.
   * @return string of jewelry
   */
  String jewelryString();
  
  /**
   * Returns the string of all the hand gear.
   * @return string of hand gear
   */
  String handGearString();
  
  /**
   * Print the name of the item.
   * @return string name of item
   */
  String printName();
  
  

}
