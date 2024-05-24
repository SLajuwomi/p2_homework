/**
 * Fills an ASCII image with colors
 * 
 * @author Stephen Lajuwomi
 * @version for Program Design 2
 */

import java.io.FileInputStream;
import java.util.Scanner;

public class MyCanvas {

      private int row;
      private int column;
      private char borderChar;   //Marks a boundary where filling should stop
      private char[][] map;     //2 Dimensional Array for to hold the ASCII art

   public MyCanvas() {
      map  = new char [10000][10000];

   }

   /**
    * Reads a file into the 2d array
    *
    * @param file
    */
   public void load(String file) {
      int i, j;
      int k=0;
      String tempLine;
      
      try 
      {
         
         Scanner df= new Scanner(new FileInputStream(file));
         row=df.nextInt();
         column=df.nextInt();
         df.nextLine();
         
         while (df.hasNextLine()) {

            // tempLine=df.nextLine();
            // char [] hji = tempLine.toCharArray();

            for (i=0; i<row; i++) {
               k=0;
               tempLine=df.nextLine();
               char [] hji = tempLine.toCharArray();
               for (j=0; j<column; j++) {
                  map[i][j]=hji[k];
                  // System.out.printf("\n\ni: "+i+"  j: "+j+"  k: "+k+"\n");
                  // System.out.println(hji);
                  // System.out.printf("hji= "+hji[k]);
                  // System.out.printf("\nmap= "+map[i][j]);
                  k++;
               }
            }
         }
      }
       
      catch(Exception e) 
      {
         e.getStackTrace();
      }
   }

 
   /**
    * Prints out the 2d array of ASCII art
    */
   public void show() {
      int i,j;
      for (i=0;i<row; i++) {
         for (j=0;j<column; j++) {
            System.out.print(map[i][j]);
         }
         System.out.println();
      }
   }

   /**
    * sets a border character to indicate where to stop filling
    * @param bChar takes in a specified character as the border
    */
   public void setBorder(char bChar) {
      borderChar = bChar;
   }

   /**
    * Fills the image file with the specifed fill character
    *
    * @param fillChar takes in the specified fill character
    * @param startingRow takes in the row to start filling from
    * @param startingColumn takes in the column to start filling from
    * @return recursively calls itslef to fill the image file
    */
   public void fill(char fillChar, int startingRow, int startingColumn) {     
      if (startingColumn<0)
         return;
      if (startingRow<0)
         return;
      if (startingColumn>=column)
         return;
      if (startingRow>=row)
         return;
      if (map[startingRow][startingColumn]==borderChar)
         return;
      if (map[startingRow][startingColumn]==fillChar)
         return;
   
      map[startingRow][startingColumn]=fillChar;
      fill(fillChar, startingRow, startingColumn+1);
      fill(fillChar, startingRow, startingColumn-1);
      fill(fillChar, startingRow+1, startingColumn);  
      fill(fillChar, startingRow-1, startingColumn);
   }
}
