/**
 * Contains the information that constitutes a single movie.
 *
 * @author  Stephen Lajuwomi
 * @version 09/12/2023
 *
 * 
 *
*/

public class Movie {
   String title;
   String genre;
   int year;
   
   public Movie(String movieTitle, String movieGenre, int movieYear) {
      title = movieTitle;
      genre = movieGenre;
      year = movieYear;
   }  
   
   @Override
   public String toString() {
      return String.format("%-30s %-20s %4d",title, genre, year);
   }
}


