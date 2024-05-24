/**
 * Analyzes and returns the words in an ArrayList that have 6 or more anagrams
 *
 * @author Stephen Lajuwomi
 * @version for Program Design 2
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayDictionary extends ArrayList<Word> {

	/**
	 * Constructor for ArrayDictionary
	 * Reads word file into ArrayList and sorts
	 * 
	 * @param file
	 * @throws IOException
	 */
   public ArrayDictionary(String file) throws
		IOException {
			BufferedReader wordFile;
			String str;
			

			wordFile = new BufferedReader(new FileReader(file));
			while ((str=wordFile.readLine()) != null) {
				this.add(new Word(str));

			}
			wordFile.close();
			Collections.sort(this);
      }

	/**
	 * Displays the entire ArrayList as read from word file 
	 */	
	public void display () {
		ListIterator<Word> wli;
		wli =this.listIterator();

		while (wli.hasNext())
			System.out.println(wli.next());
	}


	/**
	 * Counts the amount of anagrams in the ArrayList
	 * 
	 * @param w
	 * @return count of anagrams as int
	 */	
	public int countAnagrams(Word w) {
		int isIndex = Collections.binarySearch(this, w);
		int index=isIndex;
		int count=0;
		while (index<this.size() && this.get(index).sorted.equals(w.sorted)) {
         count+=1;
         index+=1;
      }

      index=isIndex-1;
      while (index>=0 && this.get(index).sorted.equals(w.sorted)) {
         count+=1;
         index-=1;
      }
		return count;
	}

	/**
	 * Prints out all anagram families that have 6 or more anagrams
	 */
	public void showBigAnagramFamiles() {
		ListIterator<Word> wli;
		wli =this.listIterator();
		try {
		int index = 0;
		while (wli.hasNext()) {
			if (countAnagrams(this.get(index))>=6) {
				System.out.println(this.get(index).word);
			}
			index+=1;
		}
	} catch (IndexOutOfBoundsException e) {

	}
} 
}
