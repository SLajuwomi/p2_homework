/**
 * Testing grounds for ParalleyArrayMovies.java with non-OOP classes
 *
 * @author  Stephen Lajuwomi
 * @version 09/12/2023
 *
 * 
 *
*/

import java.util.Scanner;

public class Driver {

   public static void main (String [] args) {
      Scanner kb= new Scanner(System.in);
      Movie movie1;
      
      movie1 = new Movie("Hunter X Hunter", "Anime", 2011);
      System.out.println(movie1);        
   }
}
