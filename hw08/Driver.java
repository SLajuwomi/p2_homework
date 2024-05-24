/**
 * Runs the code of the Palindrome object
 */
public class Driver {

   /**
    * Main method for Driver
    * @param args takes in a string from the command line as a parameter to main
    */
   public static void main(String [] args) {
      // System.out.println("\nNumber of elements passed: " + args.length);
      if (args.length != 1) {
			System.out.println("\nToo many arguments. Please try again with only one.");
         System.exit(0);
      }
      Palindrome df = new Palindrome(args[0]);
      df.run();
   }
   
}
