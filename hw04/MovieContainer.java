/**
 * Personal Movie Inventory System.
 *
 * @author  Stephen Lajuwomi	
 * @version 8/30/2023
 *
 * <pre>
 * This is the starter code for the OOP version of the movie inventory system.
 * </pre>
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintStream;

public class MovieContainer
{
   private final int MAXMOVIES= 10000;
   private Movie [] movies;
   private int numMovies;
   private String dataFile;
   
   public MovieContainer(String dataFile) {
      movies = new Movie[MAXMOVIES];
      int counter=0;           // Counter used to keep track of number of entries in file
      
      try 
      {
         Scanner df= new Scanner(new FileInputStream(dataFile));
         
         while (df.hasNextLine()) 
         {
            movies[counter] = new Movie(df.nextLine(), df.nextLine(), df.nextInt());
            df.nextLine();
            counter = counter + 1; 
         }
         df.close();
      }
       
      catch(Exception e) 
      {
         e.getStackTrace();
      }

      numMovies = counter;
      this.dataFile = dataFile;
   }

   /**
	 * Inserts a new entry into the container.
	 *
	 * @param title title of movie to be added
	 * @param genre genre of movie to be added
	 * @param year year of movie to be added
	 * @return the new movie count
	*/
   public int insert(String title, String genre, int year)
   {
     movies[numMovies] = new Movie(title, genre, year);
     return numMovies++;
   }


   /**
	 * Delete the requested movie
	 *
	 * @param index index of movie to be deleted
	 * 
	*/
   public int remove(int index)
   {    
      movies[index] = movies[numMovies-1];
      return numMovies-1;  
   }

   /**
	 * Save the contents of container to the data file
	 * 
	*/
   public void save()
   {    
      int i;     // counts up through the arrays
      
      try 
      {
         PrintStream movieFile = new PrintStream(dataFile);
            for (i=0; i<numMovies; i++) 
            {
               movieFile.println(movies[i].title);
               movieFile.println(movies[i].genre);
               movieFile.println(movies[i].year);
            }
            movieFile.close();
      }
       
      catch(Exception e) 
      {
         e.getStackTrace();
      }  
   }

	/**
	 * Displays all movie information.
	 *
	*/
   public void display() {
      int i;
      System.out.println("------------------------------------------------");
      System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
      for(i=0; i<numMovies; i++) {
         System.out.println(movies[i]);
      }
   }

	/**
	 * Displays the number of entries in the container
	 *
	*/
   public void size() {
      System.out.printf("\nNumber of entries in container: %s", numMovies);
   }

   /**
	 * Display all movies that match given title.
	 *
	 * @param title title of movie to search for
	 * 
	*/
   public void searchByTitle(String title)
   {
      String titleCaseIgnored;     // holds case insensitive search request
      int i;                       // counts up through the arrays

      titleCaseIgnored= title.toLowerCase();
      
      System.out.println("------------------------------------------------");
      System.out.printf("%s %-30s %-20s %s\n","ID","TITLE","GENRE","YEAR");
      
      for(i=0; i<numMovies; i++)
         if(movies[i].title.toLowerCase().contains(titleCaseIgnored)) {
            System.out.printf("%-2d ",i);
            System.out.println(movies[i]);  
         } 
   }

 /**
	 * Display all movies that match given title.
	 *
	 * @param genre genre of movies to search for
	 * 
	*/
   public void searchByGenre(String genre)
   {
      String genreCaseIgnored;     // holds case insensitive search request
      int i;                       // counts up through the arrays
      genreCaseIgnored= genre.toLowerCase();
      
      System.out.println("------------------------------------------------");
      System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
      
      for(i=0; i<numMovies; i++)
         if(movies[i].genre.toLowerCase().contains(genreCaseIgnored)) {
            System.out.println(movies[i]);  
         } 
   }

 /**
	 * Display all movies that match given title.
	 *
	 * @param year year of movies to search for
	 * 
	*/
   public void searchByYear(int year)
   {
      int i;                       // counts up through the arrays
      System.out.println("------------------------------------------------");
      System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
      
      for(i=0; i<numMovies; i++)
         if(year == movies[i].year) {
            System.out.println(movies[i]);
         } 
   }


}