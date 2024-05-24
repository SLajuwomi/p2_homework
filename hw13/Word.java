/**
 * Provides a simple word object that stores a word together with its letters
 * sorted.
 *
 * @author T.Sergeant
 * @version for Program Design 2
 *
 *
 */
import java.util.Arrays;

public class Word implements Comparable<Word>
{
	protected String word;    // the word
	protected String sorted;  // the word re-arranged so that its letters are sorted

	/**
	 * Store the word and create a sorted version of the word.
	 *
	 * @param word the word to be stored
	 */
	public Word(String word)
	{
		char [] letters= word.toCharArray();
		Arrays.sort(letters);
		this.word= word;
		this.sorted= new String(letters);
	}

	/**
	 * Just show the regular word when object is printed.
	 *
	 * @return the regular word
	 */
	public String toString()
	{
		return this.word + "(" + sorted + ")";
	}

	@Override 
	public boolean equals(Object obj) {
		if (this==obj) return true;
		if(!(obj instanceof Word)) return false;
		Word other = (Word)obj;
		return this.word == other.word;
	}

	@Override
	public int hashCode() {
		return new String(word).hashCode() + new String(sorted).hashCode();
	}

	@Override
	public int compareTo(Word obj) {
		Word other = (Word)obj;
		return this.sorted.compareTo(other.sorted);
	}
}