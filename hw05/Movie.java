/**
 * Contains the information that constitutes a single movie.
 *
 * @author  Stephen Lajuwomi
 * @version 09/12/2023
 *
 * 
 *
*/

import java.io.PrintStream;

public class Movie {
   private String title;
   String genre;
   private int year;
   
   public Movie(String title, String genre, int year) {
      this.title = title;
      this.genre = genre;
      this.year = year;
   }  
   
   @Override
   public String toString() {
      return String.format("%-30s %-20s %4d",title, genre, year);
   }

   /**
	 * Save the contents of container to the data file
	 * 
    * @param movieFile takes in the PrintStream object from MovieContainer
	*/
   public void writeToFile(PrintStream movieFile) {
      movieFile.println(title);
      movieFile.println(genre);
      movieFile.println(year);
   }

   /**
	 * Getter that returns the year attribute
	 * 
    * 
	*/
   public int getYear() {
      return year;
   }

   /**
	 * Checks if the current title contains the requested search title
	 * 
    * @param searchTitle takes in the requested search title
	*/
   public boolean matchesTitle(String searchTitle) {
      if(title.toLowerCase().contains(searchTitle.toLowerCase())) 
         return true; 
      else
         return false; 
         
   }   
}



