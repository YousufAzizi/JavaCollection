package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ArrayListDemo1 {

	public static void main(String[] args) {


		//Declare Arraylist
		//ArrayList<Integer> al= new ArrayList<Integer>();
		//ArrayList<String> al=new ArrayList<String>();
		//List al = new ArrayList();
		
		ArrayList al = new ArrayList();
		
		//Add new elements to the arraylist
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println("Number of elements in the arraylist is : " +al.size());
		System.out.println(al);
		
		//insert a new element
		//add(index, object);
		al.add(2,"hamed");
		
		System.out.println("After insertion: " + al);
		
		//retrieve a specific element
		System.out.println(al.get(2));
		
		//replace an element
		al.set(2, "Yousuf");
		System.out.println("After replacing with a new element : " + al);
	
		//search - contains() -- returns true or false....
		System.out.println(al.contains("Yousuf"));
		
		//isEmpty() - returns true or false...
		System.out.println(al.isEmpty());
		
		/*// for loop
		System.out.println("Reading elements using for loop.......");
		
		for(int i=0; i<=al.size(); i++) 
		{
			System.out.println(al.get(i));
		}*/
		
		/*//for each loop
		System.out.println("Reading elements using for ..each loop");
		
		for(Object e: al) {
			System.out.println(e);
		}*/
		
		//iterator
		System.out.println("Reading elements using Iterator");


		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
