package clothingl;

import clothing.AbstractClothing;

/**
 * Represents an empty node in the list.
 * @author quaydragon
 *
 */
public class EmptyNode implements ListOfItems {




  @Override
  public void updateItems(int turnCount) {
    //used by player class to update items
    
  }


  @Override
  public int getDefensiveStrength() {
    return 0;
  }

  @Override
  public int getAttackPower() {
    return 0;
  }

  @Override
  public void compareItemStrength(AbstractClothing item) {
    //used by player class to compare items.
    
  }

  @Override
  public String printName() {
    return null;
  }

  @Override
  public int headGearNumber() {
    return 0;
  }

  @Override
  public int footWearNumber() {
    return 0;
  }

  @Override
  public int handGearNumber() {
    return 0;
  }



  @Override
  public int pickUpItem(AbstractClothing item) {
    return 0;
  }



  @Override
  public String footWearString() {
    return null;
  }



  @Override
  public String headGearString() {
    return null;
  }



  @Override
  public String jewelryString() {
    return null;
  }



  @Override
  public String handGearString() {
    return null;
  }


}
