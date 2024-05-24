/**
 * Driver for testing IntList code.
 *
 * @author Stephen Lajuwomi
 * @version for Program Design 2
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver
{
	// protected static WordList linkedWordList = new WordList();
	public static void main(String [] args) throws IOException
	{
		// Word a = new Word("bomb");
		// Word b = new Word("aim");
		// System.out.println(a.sorted);
		// System.out.println(b.sorted);
		// System.out.println(a.compareTo(b));

		ArrayDictionary dict = new ArrayDictionary("../data/mywords.txt");
		// dict.display();
		// System.out.println("Final= "+dict.binSearch(new Word("win")));
		// System.out.println(dict.countAnagrams(new Word("bluest")));
		dict.showBigAnagramFamiles();

		// for (int n=0; n<dict.n; n++)
		// 	System.out.println(dict.data[n]);

		// IntList linkedList = new IntList();
		// linkedList.insert(10);
		// linkedList.insert(34);
		// linkedList.insert(75);
		// linkedList.insert(20);
		// System.out.println("Original list: ");
		// linkedList.display();
		// // System.out.println(linkedList.search(17));
		// linkedList.remove(44);
		// System.out.println("Final list: ");
		// linkedList.display();
		
		// readFile("./words.txt");
		// linkedWordList.display();

		
		// Word a = new Word("bob");
		// Word b = new Word("BOB");
		// Word c = new Word("marcus");
		// linkedWordList.insert(a);
		// linkedWordList.insert(b);
		// linkedWordList.insert(c);
		// linkedWordList.display();
		// // System.out.println(a.equals(b));
		// // System.out.println(linkedWordList.search(new Word("john")));
		// linkedWordList.remove(new Word("bob"));

		// linkedWordList.display();

		// ArrayDictionary dict = new ArrayDictionary("../data/mywords.txt");
		// // dict.display();
		// // System.out.println(dict.countAnagrams(new Word("man")));
		// dict.displayBigAnagramFamiles();
	}

	// public static void readFile(String fileName) throws
	// 	IOException {
	// 		BufferedReader wordFile;
	// 		String str;

	// 		wordFile = new BufferedReader(new FileReader(fileName));
	// 		while ((str=wordFile.readLine()) != null) {
	// 			linkedWordList.insert(new Word(str));
	// 		}
	// 		wordFile.close();
	// 	}
}

