/**
 * A class that determines different stats about Palindromes
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Palindrome
{

	protected int numWords;
	protected ArrayList<String> lines;
	protected String dataFile;
	CodeTimer timer1;
	
	/**
	 * Constrcutor for the Palindrome object
	 * @param dataFile takes in a string that paths to a datafile
	 */
	public Palindrome(String dataFile) {
		timer1 = new CodeTimer();
		timer1.start();
		lines = new ArrayList<String>();
		BufferedReader dataReader = null;
		int counter=0;
		String strCurrentLine;

		try {

			dataReader = new BufferedReader(new FileReader(dataFile));
			while ((strCurrentLine = dataReader.readLine()) != null) {

				lines.add(strCurrentLine);
				counter++;
			  }
			  dataReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
 	 }

	 numWords = counter;
	 this.dataFile = dataFile;
	}


	/**
	 * Return true if the passed parameter is a palindrome and false if not
	 * 
	 * @param phrase Reads in a specified string
	 * @return boolean value true or false
	 */
	public boolean isPalindrome (String  phrase) {		
		if (phrase.length() <= 1) {
			return true;
		}

		String firstChar = phrase.substring(0, 1);
		String lastChar = phrase.substring(phrase.length() -1, phrase.length());


		if (firstChar.equals(lastChar)){
				return isPalindrome(phrase.substring(1, phrase.length()-1));
		}
		else 
			return false;
	}

	/**
	 * Calculates the number of palindromes in the file
	 * @return the number of true statements from isPalindrom
	 */
	public int numPalindromes() {
		int i;
		int trueCounter=0;
		
		for (i=0; i<numWords; i++) {
			if (isPalindrome(lines.get(i)) == true)
				trueCounter++;
		}
		return trueCounter;
	}


	/**
	 * Calculates the percent of palindromes in the datafile
	 * @return nummber of Palindromes divided by number of words multiplied by 100 to change to percentage
	 */
	public float percentPalindromes() {
		float percent;
		percent = ((float) numPalindromes() / numWords) * 100;
		return percent;
	}

	/**
	 * Runs the program
	 */
	public void run () {
		System.out.println("+--------------------------------------------+");
		System.out.printf("Input File      : %s\n", dataFile);
		System.out.printf("Words Processed : %d\n", numWords);
		System.out.printf("# Palindromes   : %d\n", numPalindromes());
		System.out.printf("%% Palindromes   : %2.3f%%\n", percentPalindromes());
		timer1.stop();
		System.out.printf("Time Elapsed    : %s\n", timer1);
		System.out.println("+--------------------------------------------+");
		
	}
	}

