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
import player.PlayerClass;


/**
 * Tests the player class. 
 * @author quaydragon
 *
 */
public class TestPlayer {
  public PlayerClass billy;
  public PlayerClass roberta;
  public PlayerClass badBilly;
  public FootWear birkenstocks;
  public HandGear classRing;
  public HeadGear bucketHat;
  public HeadGear crown;
  public Jewelry goldChain;
  public FootWear shoe2;
  public FootWear manyShoe;
  public HandGear handGear2;
  public HandGear handGear3;
  public HandGear handGear4;
  public HandGear handGear5;
  public HandGear handGear6;
  public HandGear handGear7;
  public HandGear handGear8;
  public HandGear handGear9;
  public HandGear handGear10;
  public HandGear handGear11;
  public Jewelry necklace;

  /**
   * Sets up players.
   */
  @Before
  public void setUp() {
    
    billy = new PlayerClass(0, 5, 1, "Billy");  
    roberta = new PlayerClass(20, 15, 7, "Roberta");
    
    birkenstocks = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.MEDIUM,
        4,
        10,
        "BirkenStocks of Toxic Hippy Tears",
        1);
    shoe2 = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        10,
        10,
        "Extra Shoe of Boring",
        2);
    manyShoe = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        4,
        30,
        "Shoe of too many",
        3);
    
    classRing = new HandGear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.NEVER,
        100,
        35,
        "Class Ring of Condenscension",
        2);
    handGear2 = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        100,
        20,
        "Glove of Punch Power",
        3);
    handGear3 = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        10000,
        150,
        "Tattoo of B@d@$$ Behavior",
        4);
    handGear4 = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.SLOW,
        100,
        23,
        "Coffee of Energy",
        5);
    handGear5 = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.SLOW,
        100,
        35,
        "Lighter of Arson",
        6);
    handGear6 = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        100,
        10,
        "Pen of Fighting Words",
        7);
    handGear7 = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        100,
        23,
        "Guitar Pick of Musical Prowess",
        8);
    handGear8 = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        100,
        34,
        "Nail Polish of Poison",
        9);
    handGear9 = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        100,
        5,
        "Ring of Bling a Ling",
        10);
    handGear10 = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        100,
        67,
        "Spikes of Death",
        11);
    handGear11 = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        100,
        49,
        "Cell Phone of Manipulation",
        12);
    
    
    bucketHat = new HeadGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.FAST,
        20,
        50,
        "Bucket hat of hater relief",
        3);
    
    crown = new HeadGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        100,
        50,
        "Crown of Protection",
        3);
    
    goldChain = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        100,
        50,
        "Gold Chain of Light Power",
        4);
    
    necklace = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        2,
        50,
        "Necklace of Light Power",
        4);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpHitPoints() {
    badBilly = new PlayerClass(-1, 1, 1, "Bad Billy");
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpDefensiveStrength() {
    badBilly = new PlayerClass(1, -1, 1, "Bad Billy");
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpAttackPower() {
    badBilly = new PlayerClass(1, 1, -1, "Bad Billy");
    
    
    
  }
  
  

  @Test
  public void testPlayTurn() {
    
    //first turn
    
    String firstTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 5"
        + "\nCurrent Attack Power: 11"
        + "\nHandGear: No Items at This Time"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: BirkenStocks of Toxic Hippy Tears";
    
    billy.pickUpItem(birkenstocks);
    assertEquals(firstTurn, billy.playTurn(1));
    
    // second turn
    String secondTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 5"
        + "\nCurrent Attack Power: -24"
        + "\nHandGear: Class Ring of Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: BirkenStocks of Toxic Hippy Tears";
    
    
    billy.pickUpItem(classRing);
    assertEquals(secondTurn, billy.playTurn(2));
    
    //third turn 
    
    String thirdTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 55"
        + "\nCurrent Attack Power: -39"
        + "\nHandGear: Class Ring of Condenscension"
        + "\nHeadGear: Bucket hat of hater relief"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: "
        + "BirkenStocks of Toxic Hippy Tears";
    
    billy.pickUpItem(bucketHat);
    assertEquals(thirdTurn, billy.playTurn(3));
    
    // fourth turn 
    
    String fourthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 55"
        + "\nCurrent Attack Power: 21"
        + "\nHandGear: Class Ring of Condenscension"
        + "\nHeadGear: Bucket hat of hater relief"
        + "\nJewelry: Gold Chain of Light Power"
        + "\nFoot Wear: "
        + "BirkenStocks of Toxic Hippy Tears";
    
    billy.pickUpItem(goldChain);
    assertEquals(fourthTurn, billy.playTurn(4));
    

  }
  
  @Test
  public void testTooManyShoes() {
    
    String firstTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 5"
        + "\nCurrent Attack Power: 11"
        + "\nHandGear: No Items at This Time"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: "
        + "BirkenStocks of Toxic Hippy Tears";
    
    billy.pickUpItem(birkenstocks);
    assertEquals(firstTurn, billy.playTurn(1));
    
    // second turn
    String secondTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 5"
        + "\nCurrent Attack Power: 21"
        + "\nHandGear: No Items at This Time"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: "
        + "BirkenStocks of Toxic Hippy Tears"
        + " and Boring";
    
    
    billy.pickUpItem(shoe2);
    assertEquals(secondTurn, billy.playTurn(2));
    
    //third turn 
    
    String thirdTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 5"
        + "\nCurrent Attack Power: 26"
        + "\nHandGear: No Items at This Time"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: BirkenStocks of Toxic Hippy Tears and too many";

    
    billy.pickUpItem(manyShoe);
    assertEquals(thirdTurn, billy.playTurn(3));
    
  }
  
  @Test
  public void testTooManyHats() {
    
    String firstTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 55"
        + "\nCurrent Attack Power: 1"
        + "\nHandGear: No Items at This Time"
        + "\nHeadGear: Bucket hat of hater relief"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(bucketHat);
    assertEquals(firstTurn, billy.playTurn(3));
    
    // second turn
    String secondTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 55"
        + "\nCurrent Attack Power: 1"
        + "\nHandGear: No Items at This Time"
        + "\nHeadGear: Bucket hat of hater relief"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    
    billy.pickUpItem(bucketHat);
    assertEquals(secondTurn, billy.playTurn(4));
    
  }
  
  @Test
  public void testTooMuchHandGear() {
    
    String firstTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 5"
        + "\nCurrent Attack Power: -34"
        + "\nHandGear: Class Ring of Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(classRing);
    assertEquals(firstTurn, billy.playTurn(2));
    
    // second turn
    String secondTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 25"
        + "\nCurrent Attack Power: -34"
        + "\nHandGear: Glove of Punch Power and Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    
    billy.pickUpItem(handGear2);
    assertEquals(secondTurn, billy.playTurn(3));
    
    //third turn 
    
    String thirdTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 175"
        + "\nCurrent Attack Power: 1"
        + "\nHandGear: Glove of Punch Power, B@d@$$ Behavior and Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    
    billy.pickUpItem(handGear3);
    assertEquals(thirdTurn, billy.playTurn(4));
    
    
    String forthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 178"
        + "\nCurrent Attack Power: 71"
        + "\nHandGear: Glove of Punch Power, Energy, B@d@$$ Behavior and Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear4);
    assertEquals(forthTurn, billy.playTurn(5));
    
    
    String fifthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: 23"
        + "\nCurrent Attack Power: 176"
        + "\nHandGear: Glove of Punch Power, Arson, Energy, B@d@$$ Behavior and Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear5);
    assertEquals(fifthTurn, billy.playTurn(6));
    
    
    String sixthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: -360"
        + "\nCurrent Attack Power: 326"
        + "\nHandGear: Glove of Punch Power, Arson, "
        + "Energy, B@d@$$ Behavior, Fighting Words and Condenscension"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear6);
    assertEquals(sixthTurn, billy.playTurn(7));
    
    
    String seventhTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: -948"
        + "\nCurrent Attack Power: 501"
        + "\nHandGear: Glove of Punch Power, Arson, Energy, B@d@$$ Behavior, "
        + "Fighting Words, Condenscension and Musical Prowess"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear7);
    assertEquals(seventhTurn, billy.playTurn(8));
    
    
    String eighthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: -1787"
        + "\nCurrent Attack Power: 735"
        + "\nHandGear: Glove of Punch Power, Poison, Arson, Energy, "
        + "B@d@$$ Behavior, Fighting Words, Condenscension and Musical Prowess"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    
    billy.pickUpItem(handGear8);
    assertEquals(eighthTurn, billy.playTurn(9));
    
    
    String ninthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: -2872"
        + "\nCurrent Attack Power: 960"
        + "\nHandGear: Glove of Punch Power, Poison, Arson, Energy, "
        + "B@d@$$ Behavior, Fighting Words, "
        + "Bling a Ling, Condenscension and Musical Prowess"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear9);
    assertEquals(ninthTurn, billy.playTurn(10));
    
    
    String tenthTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: -4213"
        + "\nCurrent Attack Power: 1243"
        + "\nHandGear: Glove of Punch Power, Poison, Arson, Energy, B@d@$$ Behavior, "
        + "Death, Fighting Words, Bling a Ling, Condenscension and Musical Prowess"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear10);
    assertEquals(tenthTurn, billy.playTurn(11));
    
    
    String eleventhTurn = "Name: Billy\n"
        + "Current Hit Points: 0"
        + "\nCurrent Defensive Strength: -5815"
        + "\nCurrent Attack Power: 1499"
        + "\nHandGear: Glove of Punch Power, Poison, Manipulation, "
        + "Arson, Energy, B@d@$$ Behavior, Death, "
        + "Fighting Words, Condenscension and Musical Prowess"
        + "\nHeadGear: No Items at This Time"
        + "\nJewelry: No Items at This Time"
        + "\nFoot Wear: No Items at This Time";
    
    billy.pickUpItem(handGear11);
    assertEquals(eleventhTurn, billy.playTurn(12));
    
    

    
    
    
  }


}
