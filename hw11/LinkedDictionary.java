/**
 * Analyzes and returns the words in a WordList that have 6 or more anagrams
 *
 * @author Stephen Lajuwomi
 * @version for Program Design 2
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinkedDictionary extends WordList {

   public LinkedDictionary(String file) throws
		IOException {
			BufferedReader wordFile;
			String str;

			wordFile = new BufferedReader(new FileReader(file));
			while ((str=wordFile.readLine()) != null) {
				insert(new Word(str));
			}
			wordFile.close();
      }

	public int countAnagrams(Word w) { 
		int count=0;
		p=head;
		while (p!=null) {
			if (p.data.sorted.equals(w.sorted)) {
				count+=1;
			}
			p=p.next;
		} 
		return count;
	}

	public void displayBigAnagramFamiles() {
		WordNode j=head;
		while (j!=null) {
			if (countAnagrams(j.data)>=6) {
				System.out.println(j.data.word);
			}
			j=j.next;
		}
	}
}
