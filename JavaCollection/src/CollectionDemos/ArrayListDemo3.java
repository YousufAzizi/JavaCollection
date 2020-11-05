package CollectionDemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {


		String arr[]= {"dog", "cat", "elphant"};
		
		for(String value: arr)
		{
			System.out.println(value);
		}
		
		//convert array into arraylist
		ArrayList al=new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);

	}

}
