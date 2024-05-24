/**
 * This driver is for testing the Clicker class.
 *
 * @author
 * @version
 *
*/

public class DriverForClicker
{
	public static void main(String [] args)
	{
		Clicker one,two,three;
      int choice;
      
      one = new Clicker();
      two = new Clicker();
      
		System.out.println("Welcome to the Clicker tester");
     
      do {
         System.out.println(one);
         choice = one.menu();
         if (choice == 1)
            one.button();
         else if (choice == 2)
            one.reset();
         else if (choice == 3)
             count100(two);
      } while (choice != 4);
      
      System.out.println("The End.");    
	}
   
   public static void count100(Clicker two) {
      int i;
      for (i=0; i<100; i++) {
         two.button();
      }
      System.out.println("Counted to 100!");
      System.out.println(two);
      System.out.print("What would you like to do now??\n\n");
   }
}


