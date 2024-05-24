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
	protected static WordList linkedWordList = new WordList();
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
		
		readFile("./words.txt");
		linkedWordList.display();
	}

	public static void readFile(String fileName) throws
		IOException {
			BufferedReader wordFile;
			String str;

			wordFile = new BufferedReader(new FileReader(fileName));
			while ((str=wordFile.readLine()) != null) {
				linkedWordList.insert(new Word(str));
			}
			wordFile.close();
		}
}

