package CollectionDemos;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {


		//Union, Intersection, difference
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("HashSet 1 : "+ set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("HashSet 2: "+ set2);
		
		//union.. it collects all elements from set1 and set2 and return unique elements
		set1.addAll(set2);
		System.out.println("Union Results : "+ set1);
	}

}
