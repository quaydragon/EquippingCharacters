package driver;

import clothing.AbstractClothing;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import player.PlayerClass;

/**
 * Driver Class for equipping characters. 
 * @author quaydragon
 *
 */
public class Driver {
  

  
  static PlayerClass billy = new PlayerClass(10000, 5, 1, "Billy"); 
  static PlayerClass roberta = new PlayerClass(10000, 15, 7, "Roberta");

  
  /**
   * This is the main driver class for the equipping characters game.
   * Billy and Roberta will be automatically equipped.
   * @param args main program args
   */
  public static void main(String[] args) {
    

    
    while(true) {
    
    
      Chest chestClass = new Chest();
      
      List<AbstractClothing> chest = chestClass.getChest();
      
      
      for (int i = 0; i < chest.size(); i++) {
        Random rand = new Random(); 
        AbstractClothing randomElement = chest.get(rand.nextInt(chest.size()));
        
        billy.pickUpItem(randomElement);
        
        
      }
      
      for (int i = 0; i < chest.size(); i++) {
        Random rand = new Random(); 
        AbstractClothing randomElement = chest.get(rand.nextInt(chest.size()));
        
        roberta.pickUpItem(randomElement);
        
      }
      
  

      int rounds = 0;

      int turn = 1;
      while (billy.getHitPoints() > 0 && roberta.getHitPoints() > 0) {
        
        billy.playTurn(turn);
        roberta.playTurn(turn);
        
        int damageComparison = billy.compareTo(roberta);
        
        if (damageComparison == 1) {
          System.out.println("\n");
          System.out.println("Billy Won This Round!!");
          System.out.println("\n");
          System.out.println(billy.toString());
          System.out.println("\n");
          System.out.println(roberta.toString());
        } else {
          System.out.println("\n");
          System.out.println("Roberta Won This Round!!");
          System.out.println("\n");
          System.out.println(roberta.toString());
          System.out.println("\n");
          System.out.println(billy.toString());
          
        }
        
        turn += 1;
        rounds += 1;
        
      }
      System.out.println("\n");
      System.out.println("Number of Rounds: " + rounds);
      System.out.println("\n");
      
      if (billy.getHitPoints() == roberta.getHitPoints()) {
        System.out.println("It is a tie!!");
        System.out.println("\n");
        System.out.println(roberta.toString());
        System.out.println("\n");
        System.out.println(billy.toString());
      } else if (billy.getHitPoints() > roberta.getHitPoints()) {
        System.out.println("Billy Wins!");
        System.out.println("\n");
        System.out.println(billy.toString());
        System.out.println("\n");
        System.out.println(roberta.toString());
      } else {
        
        System.out.println("Roberta Wins!!");
        System.out.println("\n");
        System.out.println(roberta.toString());
        System.out.println("\n");
        System.out.println(billy.toString());
        
      }

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Would you like a rematch? Y or N");
      String ans = keyboard.nextLine();
      
      System.out.println(ans);
      
      keyboard.close();
      
      if (ans.equals("Y")) {
        continue;
      } else if (ans.equals("N")) {
        break;
        
      } else {
        break;
      }
         
    
    } 
    
    
  }
  
  

}
