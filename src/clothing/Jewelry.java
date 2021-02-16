package clothing;

/**
 * Creates the jewelry class.
 * 
 * @author quaydragon
 *
 */
public class Jewelry extends AbstractClothing {

  /**
   * Constructs the jewelry class from parameters.
   * 
   * @param attackOrDefense whether the jewelry can be used for attack or defense
   * @param cursed whether the jewelry is cursed
   * @param obsolescence how fast the jewelry wears out
   * @param effectiveTime how long the jewelry is effective for
   * @param power how much power the jewelry has
   * @param name the name of the jewelry
   * @param turnAquired the turn it was aquired on
   * @throws IllegalArgumentException if effective time, turn aquired or power less than 0
   */
  public Jewelry(AttackOrDefense attackOrDefense, 
      boolean cursed, 
      Obsolescence obsolescence, 
      int effectiveTime,
      int power, 
      String name, int turnAquired) throws IllegalArgumentException {
    super(attackOrDefense, cursed, obsolescence, effectiveTime, power, name, turnAquired);

  }

}
