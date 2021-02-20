package test;

import static org.junit.Assert.assertEquals;

import clothing.AttackOrDefense;
import clothing.FootWear;
import clothing.HandGear;
import clothing.HeadGear;
import clothing.Jewelry;
import clothing.Obsolescence;
import clothingl.ElementNode;
import clothingl.EmptyNode;
import clothingl.ListOfItems;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests both the clothing class and the clothing list.
 * @author quaydragon
 *
 */
public class TestClothing {
  public FootWear birkenstocks;
  public HandGear classRing;
  public HeadGear bucketHat;
  public Jewelry goldChain;
  public HandGear badGear;
  public HeadGear badHead;
  public FootWear badFoot;
  public ListOfItems items;

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
        Obsolescence.SLOW,
        100,
        50,
        "Gold Chain of Light Power",
        4);
    

    
    
    items = new ElementNode(
    birkenstocks,
    new ElementNode(classRing,
        new ElementNode(bucketHat,
            new EmptyNode())));
  }
  
  @Test
  public void testGetDefense() {
    
    
    assertEquals(50, items.getDefensiveStrength());
  }

  @Test
  public void testGetAttack() {
    
    
    assertEquals(-25, items.getAttackPower());
  }
  
  
  @Test
  public void testHeadGearNumber() {
    assertEquals(1, items.headGearNumber());
  }
  
  @Test
  public void testFootWearNumber() {
    assertEquals(1, items.footWearNumber());
  }
  
  @Test
  public void testHandGearNumber() {
    assertEquals(1, items.handGearNumber());
  }
  
  
  
  @Test
  public void testSetUp() {
    
    // Testing footwear setup
    String birkenString = "Name: BirkenStocks of Toxic Hippy Tears"
        + "\nCurrent Power: 10"
        + "\nCursed: false"
        + "\nAttack or Defense: ATTACK"
        + "\nEffective Time: 4"
        + "\nOriginal Power: 10"
        + "\nObsolescence: MEDIUM";
    
    assertEquals(birkenString, birkenstocks.toString());
    
    //Testing handgear setup
    String ringString = "Name: Class Ring of Condenscension"
        + "\nCurrent Power: -35"
        + "\nCursed: true"
        + "\nAttack or Defense: ATTACK"
        + "\nEffective Time: 100"
        + "\nOriginal Power: -35"
        + "\nObsolescence: NEVER";
 
    assertEquals(ringString, classRing.toString());
    
    // testing headgear set up
    
    String headString = "Name: Bucket hat of hater relief"
        + "\nCurrent Power: 50"
        + "\nCursed: false"
        + "\nAttack or Defense: DEFENSE"
        + "\nEffective Time: 20"
        + "\nOriginal Power: 50"
        + "\nObsolescence: FAST";
    
  
    assertEquals(headString, bucketHat.toString());
    
    String jewelryString = "Name: Gold Chain of Light Power"
        + "\nCurrent Power: 50"
        + "\nCursed: false"
        + "\nAttack or Defense: ATTACK"
        + "\nEffective Time: 100"
        + "\nOriginal Power: 50"
        + "\nObsolescence: SLOW";   
    // testing jewelry set up
    assertEquals(jewelryString, goldChain.toString());
  

  }
  
  @Test
  public void testGetType() {
    assertEquals(AttackOrDefense.ATTACK, birkenstocks.getType());
    assertEquals(AttackOrDefense.ATTACK, classRing.getType());
    assertEquals(AttackOrDefense.DEFENSE, bucketHat.getType());
    assertEquals(AttackOrDefense.ATTACK, goldChain.getType());
  }
  
  @Test
  public void testGetCursed() {
    assertEquals(false, birkenstocks.getCursed());
    assertEquals(true, classRing.getCursed());
    assertEquals(false, bucketHat.getCursed());
    assertEquals(false, goldChain.getCursed());
  }
  
  @Test
  public void testGetName() {
    assertEquals("BirkenStocks of Toxic Hippy Tears", birkenstocks.getName());
    assertEquals("Class Ring of Condenscension", classRing.getName());
    assertEquals("Bucket hat of hater relief", bucketHat.getName());
    assertEquals("Gold Chain of Light Power", goldChain.getName());
  }
  
  
  // Testing turn Obsolescence
  
  @Test
  public void testTurnObsolescence() {
        
    //birkenstocks  - medium

    assertEquals(10, birkenstocks.turnObsolescence(1));
    assertEquals(10, birkenstocks.turnObsolescence(2));
    assertEquals(5, birkenstocks.turnObsolescence(3));
    assertEquals(0, birkenstocks.turnObsolescence(4));
    
    // class ring - never
    

    assertEquals(-35, classRing.turnObsolescence(50));
    assertEquals(35, classRing.turnObsolescence(103));
    
    // bucket hat - head gear - fast
    
    
    assertEquals(50, bucketHat.turnObsolescence(5));
    assertEquals(0, bucketHat.turnObsolescence(10));
    
    // jewelry - slow

    
    assertEquals(50, goldChain.turnObsolescence(25));
    assertEquals(32, goldChain.turnObsolescence(50));
    assertEquals(16, goldChain.turnObsolescence(75));
    assertEquals(0, goldChain.turnObsolescence(80));
    
  }
  
  // Testing Illegal Argument Exception of turn obsolescence
  
  @Test(expected = IllegalArgumentException.class)
  public void testTurnInvalid() {
    
    classRing.turnObsolescence(1);
    
  }
  
  // Comparing Clothing 
  
  @Test
  public void testComparison() {
    assertEquals(1, goldChain.compareTo(birkenstocks));
    assertEquals(-1, birkenstocks.compareTo(goldChain));
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUp() {
    
    badGear = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        -40,
        30,
        "Hand Gear Bad",
        4);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpEffective() {
    
    badGear = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        -40,
        30,
        "Hand Gear Bad",
        4);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpPower() {
    
    badGear = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        40,
        -30,
        "Hand Gear Bad",
        4);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpTurn() {
    
    badGear = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        40,
        30,
        "Hand Gear Bad",
        -4);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpHeadGear() {
    
    badHead = new HeadGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        40,
        30,
        "Hand Gear Bad",
        4);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpFoot() {
    
    badFoot = new FootWear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        40,
        30,
        "Hand Gear Bad",
        4);
    
  }


}
