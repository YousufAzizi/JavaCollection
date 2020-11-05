package CollectionDemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {


	
	

		//HashSet hs= new HashSet(100); //initial capacity 100
		//HashSet hs = new HashSet(100, (float)0.90);
		//HashSet <Integer> hs=new HashSet<Integer>();
		
		HashSet hs = new HashSet();//default capacity is 16 load fa
		
		//add objects/elements into hashset
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		
		//remove
		hs.remove(16.4);
		System.out.println("After removing the element: "+hs);
		
		//There is no get method available to retrieve all the elements, we should use for loop 
		//there is no set method available to update the existing elements.
	
	//contains method available to check specific elements
		System.out.println(hs.contains("welcome"));//returns true or false..
		System.out.println(hs.contains("xyz"));//returns false..
		
		hs.isEmpty();//returns false
		
		//to read all the elements from hashset we have to use for each loop or iterator
		/*for(Object e: hs) {
			System.out.println(e);
		}*/
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	
	
	}

}
