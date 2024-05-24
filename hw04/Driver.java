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
      MovieContainer movies = new MovieContainer("../data/tinymovielist.txt");
      movies.insert("Hunter X Hunter", "Anime", 2002);
      // movies.insert("One Piece", "Anime", 1998);
      // movies.insert("Jujutsu Kaisen", "Anime", 2004);
      movies.searchByTitle("One Piece");
      movies.searchByGenre("Anime");
      movies.searchByYear(2002);
      movies.remove(2);
      movies.remove(7);
      movies.display();
      movies.size();
      movies.save();
   }
}
