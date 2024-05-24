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

public class ArrayDictionary {
	Word [] data;   //array of word objects
	int n;          //number of elements in array 

   public ArrayDictionary(String file) throws
		IOException {
			data = new Word[500000];
			BufferedReader wordFile;
			String str;
			int counter = 0;

			wordFile = new BufferedReader(new FileReader(file));
			while ((str=wordFile.readLine()) != null) {
				data[counter] = new Word(str);
				counter++;
			}
			wordFile.close();
			n=counter;
			sort();
      }

		public void display () {
			int i;
			for (i=0; i<n; i++) {
				System.out.println("["+i+"]"+data[i]);
			}
		}

		private void sort() {
			qSort(0,n-1);
		}

		public void qSort (int p, int r) {
			int q;
			if (p<r) {
				q = partition(p, r);
				qSort(p, q);
				qSort(q+1, r);
			}
		}

		public int partition (int p, int r) {
			Word k = data[p];
			int i,j;
			Word temp;
			i=p-1;
			j=r+1;

			do {
				do {j--;} while (data[j].compareTo(k)>0);
				do {i++;} while (data[i].compareTo(k)<0);
				if(i<j) {
					temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			} while (i<j);
			return j;
		}

		private int binSearch(Word w) {
			int l = 0;
			int r = (n-1);

			while (l<=r) {
				int m = l + ((r-l)/2);	

				if (data[m].sorted.compareTo(w.sorted)<0) 
					l = m+1;
				else if (data[m].sorted.compareTo(w.sorted)>0) 
					r = m-1;
				else if (data[m].sorted.compareTo(w.sorted)==0) 
					return m;
						
			}
			return -1;
		}

	public int countAnagrams(Word w) {
		int isIndex = binSearch(w);
		int index=isIndex;
		int count=0;
		while (index<n && data[index].sorted.equals(w.sorted)) {
         count+=1;
         index+=1;
      }

      index=isIndex-1;
      while (index>=0 && data[index].sorted.equals(w.sorted)) {
         count+=1;
         index-=1;
      }
		return count;
		// p=head;
		// while (p!=null) {
		// 	if (p.data.sorted.equals(w.sorted)) {
		// 		count+=1;
		// 	}
		// 	p=p.next;
		// } 
		// return count;
	}

	public void showBigAnagramFamiles() {
		int index = 0;
		while (data[index]!=null) {
			if (countAnagrams(data[index])>=6) {
				System.out.println(data[index].word);
			}
			index+=1;
		}
	}
}
