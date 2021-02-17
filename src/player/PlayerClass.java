package player;

import clothing.AbstractClothing;
import clothing.AttackOrDefense;
import clothing.FootWear;
import clothing.HandGear;
import clothing.HeadGear;
import clothing.Jewelry;
import java.util.ArrayList;
import java.util.List;


/**
 * Creates the PlayerClass by implementing player. 
 * @author quaydragon
 *
 */
public class PlayerClass implements Player {
  protected int currentHitPoints;
  protected int defensiveStrength;
  protected int atttackPower;
  protected List<FootWear> footWearList = new ArrayList<FootWear>();
  protected HeadGear headGear;
  protected List<HandGear> handGearList = new ArrayList<HandGear>();
  protected List<Jewelry> jewelryList = new ArrayList<Jewelry>();
  protected List<AbstractClothing> items = new ArrayList<AbstractClothing>();
  
  /**
   * Constructs a player from hit points, defensive strength, and attack power.
   * Throws an illegal argument exception for negative values.
   * @param hitPoints starting hit points
   * @param defensiveStrength starting defensive strength
   * @param attackPower starting attack power
   * @throws IllegalArgumentException for negative values
   */
  public PlayerClass(int hitPoints, 
      int defensiveStrength,
      int attackPower) throws IllegalArgumentException {
    
    if (hitPoints < 0 
        || defensiveStrength < 0
        || attackPower < 0) {
      throw new IllegalArgumentException("Cannot have negative hitpoints"
          + ", defensive strength,"
          + "or attack power");
    }
    
    this.currentHitPoints = hitPoints;
    this.defensiveStrength = defensiveStrength;
    this.atttackPower = attackPower;
  }
  


  @Override
  public void pickUpItem(AbstractClothing item) throws IllegalArgumentException {
    //Determines the type of the item
   
    // Add foot wear 
    if (item.getClass().isInstance(FootWear.class)) {
      if (this.footWearList.size() >= 2) {
        throw new IllegalArgumentException("Cannot have more than 2 shoes");
      }
      this.footWearList.add((FootWear) item);
      this.items.add(item);
      this.addPower(item);
    }
    
    // add head gear
    if (item.getClass().isInstance(HeadGear.class)) {
      if (this.headGear == null) {
        this.headGear = (HeadGear) item;
        this.items.add(item);
        this.addPower(item);

      }

      
    }
    
    // add jewelry
    if (item.getClass().isInstance(Jewelry.class)) {
      
      this.jewelryList.add((Jewelry) item);
      this.items.add(item);
      this.addPower(item);
      
    }
    
    // add hand gear
    if (item.getClass().isInstance(HandGear.class)) {
      if (this.handGearList.size() >= 10) {
        throw new IllegalArgumentException("Cannot have more than 10 things on fingers");
      }
      this.handGearList.add((HandGear) item);
      this.items.add(item);
      this.addPower(item);
      
    }
    
    
  }
  


  
  /**
   * Update all Items for the turn.
   */
  private void updateItems(int turnCount) {
    if (this.items.size() > 0) {
       
      for (int i = 0; i < this.items.size(); i++) {
         
        int currentPower = this.items.get(i).getPower();
        AttackOrDefense type = this.items.get(i).getType();
         
        if (type == AttackOrDefense.ATTACK) {
         
          this.atttackPower = this.atttackPower - currentPower;
            
          int newPower = this.items.get(i).turnObsolescence(turnCount);
           
          this.atttackPower += newPower;
        }
         
        if (type == AttackOrDefense.DEFENSE) {
           
          this.defensiveStrength = this.defensiveStrength - currentPower;
           
          int newPower = this.items.get(i).turnObsolescence(turnCount);
           
          this.defensiveStrength += newPower;
           
        }
      }
    }
     
  }
  

  @Override 
  public void playTurn(int turnCount) {

    //update items    
    this.updateItems(turnCount);
    
    this.toString();
    
    
  }
  
  
  @Override
  public String toString() {
    
    String hitpoints = String.format("Current Hit Points: %d", this.currentHitPoints);
    String defense = String.format("Current Defensive Strength: %d", this.defensiveStrength);
    String attack = String.format("Current Attack Power: %d", this.atttackPower);
    
    
    
    
    String returnString = hitpoints 
        + "\n" + defense
        + "\n" + attack;
    return returnString;
  }
  
  /**
   * Private function which adds points to players hit points.
   */
  private void addPower(AbstractClothing item) {
    
    if (item.getType() == AttackOrDefense.ATTACK) {
      this.atttackPower += item.getPower();
    } else {
      this.defensiveStrength += item.getPower();
    }
    
  }
  
  
  

  
  /**
   * Removes an item from an item list.
   */
  private void dropItem(AbstractClothing item) {
    
  }
  
  
  /**
   * Determines what item to hold and which to drop.
   * @param item2 second item consideration
   */
  private void compareItemStrength(AbstractClothing item2) {
    
  }
  

  @Override
  public int compareTo(Player o) {
    // TODO Auto-generated method stub
    return 0;
  }
  

}
