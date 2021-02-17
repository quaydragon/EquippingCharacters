package test;

import static org.junit.Assert.assertEquals;

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

  /**
   * Sets up players.
   */
  @Before
  public void setUp() {
    
    billy = new PlayerClass(0, 5, 1);  
    roberta = new PlayerClass(20, 15, 7);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpHitPoints() {
    badBilly = new PlayerClass(-1, 1, 1);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpDefensiveStrength() {
    badBilly = new PlayerClass(1, -1, 1);
    
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSetUpAttackPower() {
    badBilly = new PlayerClass(1, 1, -1);
    
  }
  
  

  @Test
  public void test() {

  }

}
