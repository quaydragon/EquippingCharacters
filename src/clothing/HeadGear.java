package clothing;

/**
 * Creates a Head Gear item.
 * @author quaydragon
 *
 */
public class HeadGear extends AbstractClothing {

  /**
   * Constructs the head gear class.
   * @param attackOrDefense must be defense
   * @param cursed whether or not the item is cursed
   * @param obsolescence how fast the item wears out
   * @param effectiveTime the time the item is effective
   * @param power how much power the item has
   * @param name the name of the item
   * @param turnAquired the turn the item was aquired on
   * @throws IllegalArgumentException if effective time, power, or turn aquired negative
   *         as well as attackOrDefense being ATTACK
   */
  public HeadGear(AttackOrDefense attackOrDefense, 
      boolean cursed, 
      Obsolescence obsolescence, 
      int effectiveTime,
      int power, 
      String name, 
      int turnAquired) throws IllegalArgumentException {
    super(attackOrDefense, cursed, obsolescence, effectiveTime, power, name, turnAquired);

    if (attackOrDefense == AttackOrDefense.ATTACK) {
      throw new IllegalArgumentException("Head Gear cannot be used for attack");
    }

  }

}
