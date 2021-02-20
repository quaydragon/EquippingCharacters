package clothing;

/**
 * Creates an abstract clothing class to be inherited by other clothing.
 * 
 * @author quaydragon
 *
 */
public class AbstractClothing implements Clothing {
  protected AttackOrDefense attackOrDefense;
  protected boolean cursed;
  protected Obsolescence obsolescence;
  protected int effectiveTime;
  protected int power;
  protected String name;
  // turn acquired will help us track obsolescence
  protected int turnAquired;
  protected int currentPower;
  
  
  /**
   * Creates abstract clothing class from
   * attack or defense,
   * whether an item is cursed,
   * the obsolescence of the item,
   * the effect time usage,
   * the power the item has as well as the turn it was aquired.
   * 
   * @param attackOrDefense whether the item is used for attack or defense
   * @param cursed whether or not the item cursed
   * @param obsolescence the speed of obsolescence
   * @param effectiveTime the effective time the item can be used
   * @param power how much power the item has
   * @param name the name of the item
   * @param turnAquired the turn the item is being aquired on
   * @throws IllegalArgumentException if effective time, power or turn aquired is below 0
   */
  protected AbstractClothing(AttackOrDefense attackOrDefense,
      boolean cursed,
      Obsolescence obsolescence,
      int effectiveTime,
      int power,
      String name,
      int turnAquired) throws IllegalArgumentException {
    
    if (effectiveTime < 0
        || power < 0
        || turnAquired < 1) {
      
      throw new IllegalArgumentException("Cannot have negative"
          + " effetive time, "
          + " power, "
          + "or turn aquired");
      
    }
    
    this.attackOrDefense = attackOrDefense;
    this.obsolescence = obsolescence;
    this.effectiveTime = effectiveTime;
    this.name = name;
    this.turnAquired = turnAquired;
    this.cursed = cursed;
    
    if (cursed) {
      this.power = power * -1;
    } else {
      this.power = power;
    }
    
    this.currentPower = this.power;
  }
  
  
  


  @Override
  public AttackOrDefense getType() {
    return this.attackOrDefense;
  }

  @Override
  public boolean getCursed() {
    return this.cursed;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getPower() {
    return this.currentPower;
  }
  
  @Override
  public String toString() {
    

    

    String returnString = String.format("Name: %s", this.name);
    returnString += String.format("\nCurrent Power: %d\nCursed: %b"
        + "\nAttack or Defense: %s"
        + "\nEffective Time: %d"
        + "\nOriginal Power: %d"
        + "\nObsolescence: %s", 
        this.currentPower, this.cursed,
        this.attackOrDefense,
        this.effectiveTime,
        this.power,
        this.obsolescence);
  

    return returnString;
  }





  @Override
  public int turnObsolescence(int turn) throws IllegalArgumentException {
    
    //Illegal Argument if turn happens before turn aquired
    if (turn < this.turnAquired) {
      throw new IllegalArgumentException("Cannot be picked up on an earlier turn");
    }
    // Find the turns in use
    int turnsInUse = turn - this.turnAquired;
    int firstQuarter = Math.floorDiv(this.effectiveTime, 4);
    int secondQuarter = Math.floorDiv(this.effectiveTime, 2);
    int thirdQuarter = firstQuarter + secondQuarter;
    
    
    // If the item does not lose power ever
    // If effective below or equal to the effective number of turns 
    //Done after 25% use
    if (this.obsolescence == Obsolescence.NEVER
        && turnsInUse <= this.effectiveTime) {
      this.currentPower = this.power;
      return this.power;
    } else if (this.effectiveTime < turnsInUse) {
      this.currentPower = this.currentPower * -1;
      return this.currentPower;
    } else if (this.obsolescence == Obsolescence.FAST) {
      if (turnsInUse <= firstQuarter) {
        return this.power;
      } else {
        this.currentPower = 0;
        return this.currentPower;
      }
      
      
    } else if (this.obsolescence == Obsolescence.MEDIUM) {   
      //first quarter 100%
      // second quarter 50%
      
      if (turnsInUse <= firstQuarter) {
        return this.power;
      } else if (turnsInUse <= secondQuarter) {
        this.currentPower = this.power / 2;
        return this.power / 2;
      } else {
        this.currentPower = 0;
        return 0;
      }
      
    } else if (this.obsolescence == Obsolescence.SLOW) {
      // done in 75%
      //first quarter 100%
      // second quarter 66%
      // third quarter 33%
      
      if (turnsInUse <= firstQuarter) {
        return this.power;
      } else if (turnsInUse <= secondQuarter) {
        this.currentPower = (this.power / 3) + (this.power / 3);
        return (this.power / 3) + (this.power / 3);
      } else if (turnsInUse <= thirdQuarter) {
        this.currentPower = this.power / 3;
        return this.power / 3;
      } else {
        return 0;
      }
      
      
    }
    
 
    return this.power;
  }

  /**
   * Returns 1 if object passed has more power than current object
   * and -1 if the object has less or equal power.
   * 
   * @return power comparable
   */
  @Override
  public int compareTo(Clothing o) {
    
    if (o.getType() == AttackOrDefense.ATTACK 
        && o.getPower() > 0
        && this.getType() == AttackOrDefense.DEFENSE) {
      return -1;
    } else if (this.getType() == AttackOrDefense.ATTACK
        && this.getPower() > 0
        && o.getType() == AttackOrDefense.DEFENSE) {
      return 1;
    } else if (o.getPower() > this.currentPower) {
      return -1;
    } else  {
      return 1;
    }

  }




}
