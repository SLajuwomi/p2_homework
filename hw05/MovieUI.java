/**
 * Personal Movie Inventory System UI.
 *
 * @author  Stephen Lajuwomi	
 * @version 10/1/2023
 *
 * <pre>
 * This is the starter code for UI of the pure OOP model of
 * the movie inventory system.
 * </pre>
*/

import java.util.Scanner;

public class MovieUI
{
   private MovieContainer mc;
   private Scanner kb;

   public MovieUI(String dataFile) {
      mc = new MovieContainer("../data/tinymovielist.txt");
      this.kb= new Scanner(System.in);
   }

   public void run()
   {
      int choice;						 // user's selection from the menu
      

      do {
         choice= menuChoice();
      	if (choice==1)
      		enterMovie();
         else if (choice==2)
      		deleteMovie();
         else if (choice==3)
            display();
         else if (choice==4)
            searchByGenre();
         else if (choice==5)
            searchByTitle();
         else if (choice==6)
            searchByYear(); 
      } while (choice!=0);
   
      mc.save();
      System.out.println("\nTHE END");
   }

   	/**
	 * Displays menu and get's user's selection
	 *
	 * @return the user's menu selection
	*/
   public int menuChoice()
   {
      int choice;	 // user's selection
   
      System.out.println("\n\n");
      System.out.print("------------------------------------\n");
      System.out.print("[1] Add a Movie\n");
      System.out.print("[2] Delete a Movie\n");
      System.out.print("[3] List All Movies\n");
      System.out.print("[4] Search by Genre\n");
      System.out.print("[5] Search by Title\n");
      System.out.print("[6] Search by Year\n");
      System.out.print("---\n");
      System.out.print("[0] Exit Program\n");
      System.out.print("------------------------------------\n");
      do {
         System.out.print("Your choice: ");
         choice= kb.nextInt();
         kb.nextLine();
      } while (choice < 0 || choice > 6);
   
      return choice;
   }

   /**
    * Allows user to enter a movie.
    */
   public void enterMovie() {
      System.out.print("Enter movie title : ");
      String title = kb.nextLine();
      System.out.print("Enter movie genre: ");
      String genre = kb.nextLine();
      System.out.print("Enter year of movie: ");
      int year = kb.nextInt();
      kb.nextLine();
      mc.insert(title, genre, year);
   }

   /**
    * Delete the requested movie.
    */
   public void deleteMovie() {
      int idToDelete;       // user's movie request
      searchByTitle();
      System.out.print("Enter the ID to delete: ");
      idToDelete = kb.nextInt();
      kb.nextLine();
      
      mc.remove(idToDelete);
   }

   /**
    * Delete the requested movie.
    */
   public void display() {
      mc.display();
   }

   /**
    * Search movies by requested title.
    */
   public void searchByTitle()
   {
      String title;
      System.out.print("Enter title: "); // get title from user
      title= kb.nextLine();
      mc.searchByTitle(title);   // pass title along to our container
   }

   /**
    * Search movies by requested genre.
    */
   public void searchByGenre()
   {
      String genre;
      System.out.print("Enter genre: "); // get genre from user
      genre= kb.nextLine();
      mc.searchByGenre(genre);   // pass genre along to our container
   }

   /**
    * Search movies by number of years.
    */
      public void searchByYear()
      {
         int year;
         System.out.print("Enter year: "); // get year from user
         year= kb.nextInt();
         kb.nextLine();
         mc.searchByYear(year);   // pass year along to our container
      }

}