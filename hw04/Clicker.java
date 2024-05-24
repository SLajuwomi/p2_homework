/**
 * A clicker is used to count things.
 *
 * @author
 * @version
 *
*/

import java.util.Scanner;

public class Clicker
{
   private int counter;
   
   public Clicker() {
      counter = 0;
   }

   public int menu() {
      Scanner kb= new Scanner(System.in);
      int choice;	
      
      System.out.print("\n\nClicker Tester\n");
      System.out.println("============================");
      System.out.println("[1] Click Button");
      System.out.println("[2] Reset Counter");
      System.out.println("[3] Count to 100");
      System.out.println("[4] Exit Program");
      System.out.println("============================");
      do {
         System.out.print("Your choice: ");
         choice= kb.nextInt();
      } while (choice < 1 || choice > 3);
      
      return choice;
   }
   public int button() {
      counter = counter+1;
      System.out.println("Button has been pressed!");
      System.out.println("Counter is now at: "+counter);
      return counter;
   }
   
   public String toString() {
      return "Current Value of counter: "+counter;
   }
   
   public int reset() {
      counter = 0;
      System.out.println("Counter has been reset to: "+counter);
      return counter;
   }
}

