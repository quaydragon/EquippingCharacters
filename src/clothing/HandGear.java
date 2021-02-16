package clothing;

/**
 * Creates the HandGear class.
 * 
 * @author quaydragon
 *
 */
public class HandGear extends AbstractClothing {

  /**
   * Constructs the hand gear class from parameters.
   * 
   * @param attackOrDefense whether the hand gear can be used for attack or defense
   * @param cursed whether the hand gear is cursed
   * @param obsolescence how fast the hand gear wears out
   * @param effectiveTime how long the hand gear is effective for
   * @param power how much power the hand gear has
   * @param name the name of the hand gear
   * @param turnAquired the turn it was aquired on
   * @throws IllegalArgumentException if effective time, turn aquired or power less than 0
   */  
  public HandGear(AttackOrDefense attackOrDefense, 
      boolean cursed, 
      Obsolescence obsolescence, 
      int effectiveTime,
      int power, 
      String name, 
      int turnAquired) throws IllegalArgumentException {
    super(attackOrDefense, cursed, obsolescence, effectiveTime, power, name, turnAquired);

  }

}
