/**
 * Driver for testing IntList code.
 *
 * @author Stephen Lajuwomi
 * @version for Program Design 2
 *
 */


import java.io.IOException;

public class Driver
{
	public static void main(String [] args) throws IOException
	{
		CodeTimer timer = new CodeTimer();
		ArrayDictionary dict = new ArrayDictionary("../data/mywords.txt");
		dict.display();
		System.out.println(dict.countAnagrams(new Word("silent")));
		// timer.start();
		// dict.showBigAnagramFamiles();
		// timer.stop();
		// System.out.println(timer);

	}
}

