/**
 * Driver for testing IntList code.
 *
 * https://josephus.sergeantservices.com/classes/p2/homework/hw11/
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

		LinkedDictionary dict = new LinkedDictionary("../data/mywords.txt");
		// dict.display();
		// System.out.println(dict.countAnagrams(new Word("angel")));
		dict.displayBigAnagramFamiles();
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

