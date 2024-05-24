/**
 * Demonstrates use of Java's ArrayList.
 *
 * @author  TSergeant
 * @version for Program Design 2
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList
{
	public static void main(String [] args)
	{
		ArrayList<Word> wl;

		wl = new ArrayList<Word>();

		wl.add(new Word("silent"));
		wl.add(new Word("listen"));

		Word current;
		
		ListIterator<Word> wli;
		wli = wl.listIterator();

		while (wli.hasNext())
			System.out.println(wli.next());

		// current = wli.next();
		// System.out.println(current);
		
		// current = wli.next();
		// System.out.println(current);

		ArrayList<String> al;
		al= new ArrayList<String>();

		al.add("hi");
		al.add("there");

		ListIterator<String> sli;
		sli = al.listIterator();

		while (sli.hasNext())
			System.out.println(sli.next());





		// System.out.println(wl.size());
		// System.out.println(wl.indexOf(new Word("listen")));
		// System.out.println(wl.indexOf(new Word("silent")));
		// System.out.println("Original List");
		// System.out.println("=============");
		// for (int i=0; i<wl.size(); i++) {
			
		// 	System.out.println(wl.get(i));
		// }
		// wl.remove(1);
		// System.out.println();
		// System.out.println("New List");
		// System.out.println("=============");
		// for (int i=0; i<wl.size(); i++) {
		// 	System.out.println(wl.get(i));
		// }

		

		
		// System.out.println(al.size());
		// System.out.println(al.indexOf("hi"));
		// System.out.println(al.indexOf("there"));
		// System.out.println(al.get(0));
		// System.out.println(al.get(1));
		}
	}
