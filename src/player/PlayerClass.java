package player;

import clothing.AbstractClothing;
import clothing.AttackOrDefense;
import clothing.FootWear;
import clothing.HandGear;
import clothing.HeadGear;
import clothing.Jewelry;
import clothing.Obsolescence;
import clothingl.ElementNode;
import clothingl.EmptyNode;
import clothingl.ListOfItems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Creates the PlayerClass by implementing player. 
 * @author quaydragon
 *
 */
public class PlayerClass implements Player {
  protected int currentHitPoints;
  protected int defensiveStrength;
  protected int atttackPower;
  protected int attackPowerWeapons;
  protected int defensePowerWeapons;
  protected List<FootWear> footWearList = new ArrayList<FootWear>();
  protected HeadGear headGear;
  protected List<HandGear> handGearList = new ArrayList<HandGear>();
  protected List<Jewelry> jewelryList = new ArrayList<Jewelry>();
  protected List<AbstractClothing> items = new ArrayList<AbstractClothing>();
  protected String name;
  public ListOfItems itemNodes;

  
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
      int attackPower,
      String name) throws IllegalArgumentException {
    
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
    this.name = name;
    
    Jewelry fakeJewelry = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        0,
        0,
        "Design of Purpose",
        1);
    

    
    itemNodes = new ElementNode(
        fakeJewelry,
    new ElementNode(fakeJewelry,
        new ElementNode(fakeJewelry,
            new EmptyNode())));
    
    
    attackPowerWeapons = 0;
    defensePowerWeapons = 0;
      


  }
  


  @Override
  public void pickUpItem(AbstractClothing item) throws IllegalArgumentException {
    
    System.out.println("Trying to add item");
    int canAdd = itemNodes.pickUpItem(item);
    
    System.out.println(canAdd);
    
    if (canAdd == 1) {
      itemNodes = new ElementNode(item, itemNodes);
      System.out.println(itemNodes.printName());
      
    } else {
      itemNodes.compareItemStrength(item);
      System.out.println(itemNodes.printName());
    }    
    
  }
    
    
  
  


  
  /**
   * Update all Items and different powers for the turn.
   */
  private void updateItems(int turnCount) {
    this.atttackPower -= this.attackPowerWeapons;
    this.defensiveStrength -= this.defensePowerWeapons;
    
    
    itemNodes.updateItems(turnCount);
    
    this.atttackPower += this.itemNodes.getAttackPower();
    this.defensiveStrength += this.itemNodes.getDefensiveStrength();
    this.attackPowerWeapons += this.itemNodes.getAttackPower();
    this.defensePowerWeapons += this.itemNodes.getDefensiveStrength();
    
     
  }
  

  @Override 
  public String playTurn(int turnCount) {
    this.updateItems(turnCount);
    return this.toString();
  }
  
  
  /**
   * Gets the string given from the node classes. 
   * 
   * @param str from the node classes
   * @return clean string for toString() method
   */
  private String stringProcessing(String str) {
    
    System.out.println(str);
    

    
    if (str == null) {
      return "No Items at This Time";
    }
    str = str.replace("Design of Purpose", "");

    

    
    str = str.replace("null", "");
    

    String[] process = str.split("   ");
    
    if (str.trim().length() == 0) {
      return "No Items at This Time";
    }
    
    Set<String> cleanStrings  = new HashSet<String>();
    
    Collections.addAll(cleanStrings, process);
    
    String[] cleanArray = (String[]) cleanStrings.toArray(new String[0]);
    
    String returnString = "";
    
    if (cleanStrings.size() == 1) {
      return cleanArray[0];
    } else {
      for (int i = 0; i < cleanArray.length; i++) {
        String[] splits = cleanArray[i].split(" of ");
        if (i == 0) {
          returnString += cleanArray[0];
        } else if (i == process.length - 1) {
          returnString += " and " + splits[1];
        } else {

          returnString += ", " + splits[1]; 
        }
       
        
      }
      
    }
   
    
    return returnString;
  }
  

  
  
  @Override
  public String toString() {
    
    String footString = itemNodes.footWearString();
    String footWear = "Foot Wear: ";
   
    
    footWear += this.stringProcessing(footString);
    
    String handString = itemNodes.handGearString();
    String handGear = "HandGear: ";
    handGear += this.stringProcessing(handString);
    
    String headGear = "HeadGear: ";
    
    if (itemNodes.headGearString() == null) {
      headGear += "No Items at This Time";
    } else {
      headGear += itemNodes.headGearString();
    }
    

    String jewelryString = itemNodes.jewelryString();
    String jewelry = "Jewelry: ";
    jewelry += this.stringProcessing(jewelryString);
    

    String hitpoints = String.format("Current Hit Points: %d", this.currentHitPoints);
    String defense = String.format("Current Defensive Strength: %d", this.defensiveStrength);
    String attack = String.format("Current Attack Power: %d", this.atttackPower);
    String player = this.name;
   

    
    String returnString = hitpoints 
        + "\n" + defense
        + "\n" + attack
        + "\n" + handGear
        + "\n" + headGear
        + "\n" + jewelry
        + "\n" + footWear;
    return "Name: " + player + "\n" + returnString;
    

  }
  

  
  

  @Override
  public int compareTo(Player o) {    
    int damageO = this.atttackPower - o.getDefensiveStrength();
    int damageThis = o.getAttackPower() - this.getDefensiveStrength();
    
    this.subtractHitPoints(damageThis);
    o.subtractHitPoints(damageO);
    
    if (damageThis > damageO) {
      return 1;
    }
  
    return 0;
  }



  @Override
  public int getAttackPower() {
    return this.atttackPower;
  }



  @Override
  public int getDefensiveStrength() {
    return this.defensiveStrength;
  }



  @Override
  public int getHitPoints() {
    return this.currentHitPoints;
  }



  @Override
  public void subtractHitPoints(int damage) {
    this.currentHitPoints -= damage;
    
  }
  

}
