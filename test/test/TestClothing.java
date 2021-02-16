package test;

import static org.junit.Assert.assertEquals;

import clothing.AttackOrDefense;
import clothing.FootWear;
import clothing.HandGear;
import clothing.HeadGear;
import clothing.Jewelry;
import clothing.Obsolescence;
import org.junit.Before;
import org.junit.Test;

public class TestClothing {
  public FootWear birkenstocks;
  public HandGear classRing;
  public HeadGear bucketHat;
  public Jewelry goldChain;

  /**
   * Sets up clothing classes. 
   */
  @Before
  public void setUp() {
    birkenstocks = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.MEDIUM,
        4,
        10,
        "BirkenStocks of Toxic Hippy Tears",
        1);
    
    classRing = new HandGear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.NEVER,
        100,
        35,
        "Class Ring of Condenscension",
        2);
    
    bucketHat = new HeadGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.FAST,
        20,
        50,
        "Bucket hat of hater relief",
        3);
    
    goldChain = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        5,
        2,
        "Gold Chain of Light Power",
        4);
  }

  @Test
  public void testSetUp() {
    
    
    
  }

}
