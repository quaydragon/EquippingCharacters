package clothingl;


import clothing.AbstractClothing;
import clothing.AttackOrDefense;
import clothing.FootWear;
import clothing.HandGear;
import clothing.HeadGear;
import clothing.Jewelry;


/**
 * Element node class which will hold abstract clothing
 * and other nodes. 
 * @author quaydragon
 *
 */
public class ElementNode implements ListOfItems {
  private AbstractClothing item;
  private ListOfItems rest;


  
  /**
   * This class represents an element node in list of items.
   * @param item a clothing item
   * @param rest the rest of the clothing items
   */
  public ElementNode(AbstractClothing item, ListOfItems rest) {
    
    this.item = item;
    this.rest = rest;
    
  }

  /**
   * Drops items that have a lower value than another.
   * @param item to drop
   * @param replacement the replacement
   */
  private void dropItem(AbstractClothing item, AbstractClothing replacement) {
    
    System.out.println("Item Discarded");
    System.out.println(item.getName() + " replaced with " + replacement.getName());
    
    this.item = replacement;
    
  }

  @Override
  public int pickUpItem(AbstractClothing item) {
    System.out.println("\nPicking Up Item");
    
    if (item.getClass() ==  FootWear.class) {
      int limitFoot = this.footWearNumber();
      
      if (limitFoot < 2) {
        return 1;
      } else {
        return 0;
      }
    } else if (item.getClass() ==  HeadGear.class) {
      int limitHead = this.headGearNumber();
      
      if (limitHead < 1) {
        return 1; 
      } else {
        return 0;
      }
      
    } else if (item.getClass() ==  HandGear.class) {
      int limitHand = this.handGearNumber();
        
      if (limitHand < 10) {
        return 1;
      } else {
        return 0;
      }
        
        
    }
    
    
    return 0;
    
  }

  @Override
  public void updateItems(int turnCount) {
    
    this.item.turnObsolescence(turnCount);
    
    this.rest.updateItems(turnCount);
    
  }
  
  @Override
  public String printName() {
    String returnThis = this.item.toString();
    return returnThis;
  }



  @Override
  public int getDefensiveStrength() {
    
    if (item.getType() == AttackOrDefense.DEFENSE) {
      return this.item.getPower() + this.rest.getDefensiveStrength();
    }
    return this.rest.getDefensiveStrength();
  }

  @Override
  public int getAttackPower() {
    
    if (item.getType() == AttackOrDefense.ATTACK) {
      return this.item.getPower() + this.rest.getAttackPower();
    }
    return this.rest.getAttackPower();
  }
  
  

  @Override
  public void compareItemStrength(AbstractClothing newItem) {
   
    if (newItem.getClass() == this.item.getClass()) {
      int comparison = this.item.compareTo(newItem);
      System.out.println(this.rest.getDefensiveStrength());
      if (comparison == -1) {
        this.dropItem(this.item, newItem);
        return;
      }

      
    }

    this.rest.compareItemStrength(newItem);
    
  }


  @Override
  public int headGearNumber() {    
    if (this.item.getClass() == HeadGear.class) {
      return 1 + this.rest.headGearNumber();
    }
    return this.rest.headGearNumber();
  }


  @Override
  public int footWearNumber() {
    
    if (this.item.getClass() ==  FootWear.class) {
      return 1 + this.rest.footWearNumber();
    }
    return this.rest.footWearNumber();
  }


  @Override
  public int handGearNumber() {
    if (this.item.getClass() == HandGear.class) {
      return 1 + this.rest.handGearNumber();
    }
    return this.rest.handGearNumber();
  }


  @Override
  public String footWearString() {
    
    if (this.item.getClass() == FootWear.class) {
      return this.item.getName() + "   " + this.rest.footWearString();
    }
  
    return this.rest.footWearString();
  }


  @Override
  public String headGearString() {

    
    if (this.item.getClass() ==  HeadGear.class) {
      return this.item.getName();
    }
    
    return this.rest.headGearString();
  }


  @Override
  public String jewelryString() {

    if (this.item.getClass() ==  Jewelry.class) {
      return this.item.getName() + "   " + this.rest.jewelryString();
    }
  
    return this.rest.jewelryString();
  }


  @Override
  public String handGearString() {
    
    if (this.item.getClass() ==  HandGear.class) {
      return this.item.getName() + "   " + this.rest.handGearString();
    }
  
    return this.rest.handGearString();
  }
  





}
