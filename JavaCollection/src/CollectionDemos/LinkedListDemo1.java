package CollectionDemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {


		//Declare Linked List
		
		//LinkedList l = new LinkedList();
		
		//LinkedList<Integer> l= new LinkedList<Integer>();
		//LinkedList<String> l= new LinkedList<String>();
		

		LinkedList l = new LinkedList();
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		
		//insert/adding element in the middle of linked list
		l.add(3, "java");
		System.out.println("After inserting element : " +l);
		
		//retrieving value/object
		System.out.println(l.get(3));  
		
		//replace a value
		l.set(3, "python");  
		System.out.println("After changing the  element : " +l);
		
		
		//contains method returns true if it contains the value
		System.out.println(l.contains("python"));
		System.out.println(l.contains("java"));
		
		//isEmpty() returns true/false
		System.out.println(l.isEmpty());
		
		
		/*//reading elements from Linkedlist using for loop
		for(int i=0; i<l.size(); i++) {
			
			System.out.println(l.get(i));
		}*/
		
	/*	//reading elements from LL using for each loop
		for(Object e: l) {
			System.out.println(e);
			}
			*/
			//iterator() method
			Iterator it=l.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}


