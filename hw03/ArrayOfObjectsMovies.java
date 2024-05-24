/**
 * Personal Movie Inventory System.
 *
 * @author  Stephen Lajuwomi	
 * @version 8/30/2023
 *
 * <pre>
 * This is the starter code for the parallel array version of the movie
 * inventory system.
 * </pre>
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ArrayOfObjectsMovies
{
   public static final String DATAFILE= "../data/tinymovielist.txt";
   public static final int MAXMOVIES= 10000;

   public static void main(String [] args)
   {
      int choice;						 // user's selection from the menu
      Movie [] movieArray;
      movieArray = new Movie[MAXMOVIES];
      int numberOfEntries;
      
   
      numberOfEntries= loadMovies(movieArray);
      System.out.println("Number of entries read from data file: "+numberOfEntries);
      do {
         choice= getMenuChoice();
      	if (choice==1)
      		numberOfEntries= enterMovie(movieArray, numberOfEntries);
         else if (choice==2)
      		numberOfEntries= deleteMovie(movieArray, numberOfEntries);
         else if (choice==3)
            displayAll(movieArray, numberOfEntries);
         else if (choice==4)
            searchByGenre(movieArray, numberOfEntries);
         else if (choice==5)
            searchByTitle(movieArray, numberOfEntries);
         else if (choice==6)
            searchByYear(movieArray, numberOfEntries); 
      } while (choice!=0);
      
      saveMovieFile(movieArray, numberOfEntries);
   
      System.out.println("\nTHE END");
   }


	/**
	 * Allow user to enter a new movie.
	 *
	 * @param titles array of movie titles
	 * @param genres array of movie genres
	 * @param years array of movie copyright dates
	 * @param n the actual number of movies currently in the array
	 * @return the new movie count
	*/
   public static int enterMovie(Movie [] movieArray, int n)
   {
      Scanner kb= new Scanner(System.in);
      movieArray[n] = new Movie(null, null, 0);
      System.out.print("Enter movie title : ");
      movieArray[n].title = kb.nextLine();
      System.out.print("Enter movie genre: ");
      movieArray[n].genre = kb.nextLine();
      System.out.print("Enter year of movie: ");
      movieArray[n].year = kb.nextInt();
      kb.nextLine();
   
      return n+1;
   }




	/**
	 * Load movies from the data file into the arrays
	 *
	 * @param movieArray array of Movie objects
	 * @return the actual number of movies loaded into the arrays
	*/
   public static int loadMovies(Movie [] movieArray)
   { 
      int counter=0;           // Counter used to keep track of number of entries in file
      
      try 
      {
         
         Scanner df= new Scanner(new FileInputStream(DATAFILE));
         
         while (df.hasNextLine()) 
         {
            movieArray[counter] = new Movie(df.nextLine(), df.nextLine(), df.nextInt());
            df.nextLine();
            counter = counter + 1; 
         }
         df.close();
      }
       
      catch(Exception e) 
      {
         e.getStackTrace();
      }
     
      return counter;
   	
   }
   
   /**
	 * Saves the file containing movies and all edits
	 *
	 * @param titles array of movie titles
	 * @param genres array of movie genres
	 * @param years array of movie copyright dates
	 * @return the actual number of movies loaded into the arrays
	*/
   public static void saveMovieFile(Movie [] movieArray, int n)
   {
      int i;     // counts up through the arrays
      
      try 
      {
         PrintStream movieFile = new PrintStream(DATAFILE);
         
         for (i=0; i<n; i++) 
         {
            movieFile.println(movieArray[i].title);
            movieFile.println(movieArray[i].genre);
            movieFile.println(movieArray[i].year);
         }
         movieFile.close();
      }
       
      catch(Exception e) 
      {
         e.getStackTrace();
      }
   }
   
   
   
   /**
	 * Delete the requested movie
	 *
	 * @param titles array of movie titles
	 * @param genres array of movie genres
	 * @param years array of movie copyright dates
    * @param n the actual number of movies currently in the array
	*/
   public static int deleteMovie(Movie [] movieArray, int n)
   {
      int idToDelete;       // user's movie request
      Scanner kb= new Scanner(System.in);
      searchByTitle(movieArray, n);
      System.out.print("Enter the ID to delete: ");
      idToDelete = kb.nextInt();
      kb.nextLine();
      
      while (idToDelete < 1 || idToDelete > n) {
         System.out.println("This is not a valid ID. Please try again.");
         System.out.print("Enter the ID to delete: ");
         idToDelete = kb.nextInt();
         kb.nextLine();
      }
      movieArray[idToDelete] = movieArray[n-1];
      return n-1;     
   }
   
	/**
	 * Displays all movie information.
	 *
	 * @param movieArray array of Movie objects
	 * @param n the actual number of movies currently in the array
	*/
   public static void displayAll(Movie [] movieArray, int n)
   {
      int i;
      System.out.println("------------------------------------------------");
      System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
      for(i=0; i<n; i++) {
         System.out.println(movieArray[i]);
      }
   }
   
   /**
	 * Display all movies that match given genre.
	 *
	 * @param movieArray array of Movie objects
	 * @return the actual number of movies loaded into the arrays
	*/
   public static void searchByGenre(Movie [] movieArray, int n)
   {
      String genreFilter;         // user's search request
      String genreCaseIgnored;    // holds case insensitive search request   
      int i;                      // counts up through the arrays
      Scanner kb= new Scanner(System.in);
      System.out.print("Enter the genre to search for: ");
      genreFilter = kb.nextLine();
      genreCaseIgnored= genreFilter.toLowerCase();
      
      System.out.println("------------------------------------------------");
      System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
      
      for(i=0; i<n; i++)
         if(genreCaseIgnored.equals(movieArray[i].genre.toLowerCase())) {
            System.out.println(movieArray[i]); 
         } 
   }
   
   /**
	 * Display all movies that match given title.
	 *
	 * @param movieArray array of Movie objects
	 * @return the actual number of movies loaded into the arrays
	*/
   public static void searchByTitle(Movie [] movieArray, int n)
   {
      String titleFilter;          // user's search request
      String titleCaseIgnored;     // holds case insensitive search request
      int i;                       // counts up through the arrays
      Scanner kb= new Scanner(System.in);
      System.out.print("Enter the title to search for: ");
      titleFilter= kb.nextLine();
      titleCaseIgnored= titleFilter.toLowerCase();
      
      System.out.println("------------------------------------------------");
      System.out.printf("%s %-30s %-20s %s\n","ID","TITLE","GENRE","YEAR");
      
      for(i=0; i<n; i++)
         if(movieArray[i].title.toLowerCase().contains(titleCaseIgnored)) {
            System.out.printf("%-2d ",i);
            System.out.println(movieArray[i]);  
         } 
   }
   
	/**
	 * Display all movies that match given year.
	 *
	 * @param movieArray array of Movie objects
	 * @return the actual number of movies loaded into the arrays
	*/
   public static void searchByYear(Movie [] movieArray, int n)
   {
      int yearFilter;     // user's search request
      int i;              // counts up through the arrays
      Scanner kb= new Scanner(System.in);
      System.out.print("Enter the year to search for: ");
      yearFilter = kb.nextInt();
      kb.nextLine();
      
      System.out.println("------------------------------------------------");
      System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
      
      for(i=0; i<n; i++)
         if(yearFilter == movieArray[i].year) {
            System.out.println(movieArray[i]);
         } 
   }


	/**
	 * Displays menu and get's user's selection
	 *
	 * @return the user's menu selection
	*/
   public static int getMenuChoice()
   {
      Scanner kb= new Scanner(System.in);
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
      } while (choice < 0 || choice > 6);
   
      return choice;
   }
}
