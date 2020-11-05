package CollectionDemos;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap m= new HashMap();
		HashMap<Integer, String> m= new HashMap<Integer, String>();//declaring hashmap with specific data type

		//HashMap m= new HashMap();
		m.put(101,"John");
		m.put(102,"David");
		m.put(103,"Scott");
		m.put(104,"Mary");
		m.put(105,"Tye");
		
		m.put(103, "X");//duplicate key is not allowed,it will print one time 103 but it will be replaced with the new value.
		
		System.out.println(m);
		
		/*System.out.println(m.get(102));
		m.remove(105);//removes the pair from hashmap
		System.out.println(m.containsKey(101));//true
		System.out.println(m.containsKey(107));//false
		
		System.out.println(m.containsValue("Mary"));//true
		System.out.println(m.containsValue("Y"));//false
		
		*/System.out.println(m.isEmpty());//false
		System.out.println(m.keySet());//returns all the keys as set
		
		
		//EntrySet();
		System.out.println(m.entrySet());//return all the entries as a pair set objects
		//print individual key one by one
	/*	for(Object i:m.keySet()) 
		{
			System.out.println(i);
		}
		
		System.out.println(m.values());//returns all the valuse as a collections
		//print individual value one by one
		for(Object i:m.values()) {
			System.out.println(i);
		}*/
		for(Object i:m.keySet())
		{
			System.out.println(i+ "   "+m.get(i));
		}
		
		
	}

}
