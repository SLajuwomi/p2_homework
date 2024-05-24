/**
 * A linked list of Wordeger values.
 *
 * @author Stephen Lajuwomi
 * @version for Program Design 2
 *
 */
public class WordList
{
	private WordNode head;
	private WordNode p;

	/**
	 * A new list has head poWording nowhere.
	 */
	public WordList()
	{
		head= null;
	}


	/**
	 * Displays contents of the list.
	 */
	public void display()
	{
		p = head;
		while (p!=null) {
			System.out.println(p.data);
			p=p.next;
		}


	}


	/**
	 * In an unordered list we can just add to the front.
	 *
	 * @param newdata The new element to be inserted Wordo the list.
	 */
	public void insert(Word newdata)
	{
		p=new WordNode();
		p.data=newdata;
		p.next=head;
		head=p;
	}


	// /**
	//  * Search the list for the value val.
	//  *
	//  * @param val the value to be searched for
	//  * @return reference to the found node (null if not found)
	//  */
	// public WordNode search(Word val)
	// {
	// 	p = head;
	// 	while (p!=null) {
	// 		if (p.data==val)
	// 			return p;
	// 		p=p.next;
	// 	}
	// 	return null;
	// }


	// /**
	//  * Find first occurrence of val (if it exists) and remove it from the list.
	//  *
	//  * @param val the value to be removed
	//  */
	// public void remove(Word val)
	// { 
	// 	p = head;
	// 	WordNode q = null; 
		
	// 	if (p != null && p.data == val) { 
	// 		head = p.next;
	// 		return; 
	// 	} 

	// 	while (p != null && p.data != val) { 
	// 		q = p; 
	// 		p = p.next; 
	// 	} 

	// 	if (p == null) 
	// 		return; 

	// 	q.next = p.next; 
	// 	}
	}

