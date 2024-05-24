/**
 * Driver for MovieContainer.java
 *
 * @author  Stephen Lajuwomi
 * @version 09/12/2023
 *
 * 
 *
*/

public class Driver {

   public static void main (String [] args) {
      MovieUI mui= new MovieUI("../data/movielist.txt");
      mui.run();
   }
}
