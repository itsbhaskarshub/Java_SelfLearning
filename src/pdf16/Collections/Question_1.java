package pdf16.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Question_1 {

	public static void main(String[] args) {
		
//		1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
//		ArrayList and perform the below operations

		ArrayList<String> arr = new ArrayList<String>();

//		Add an element to the ArrayList
		arr.add("Hello");
		arr.add("World");
		arr.add("Here");
		arr.add("is");
		arr.add("Java");
		arr.add("Programming");
		arr.add("Language");
		arr.add("to");
		arr.add("Basic");
		arr.add("to");


//		Iterate through the ArrayList by using Iterator object  
		Iterator<String> itr = arr.iterator();

		
//		Add an element at a specific index
		arr.add(10, "Advance");
//		Remove an element from the ArrayList, Remove at an index
		arr.remove(5);
		
//		Update the element at a specific index
       
		arr.set(0, "Java");
/*	
		for(String i :arr ) {
			System.out.println(i);
		}
*/		
//		Check the element is present at a particular index
		for(String i :arr ) {
			if(i == "Language") {
				System.out.println(i);
			}
		}
//		Get an element at a particular index
		
		String atIndex = arr.get(3);
		System.out.println(atIndex);
		
//		Find out the size of the ArrayList
		
		int length = arr.size();
		System.out.println(length);
		
//		Check the given element is present in the ArrayList
		String text = "Basic";
			if(arr.contains(text)) {
				System.out.println(text);
			}
//			Remove all elements of the ArrayList		
		arr.removeAll(arr);
		}
		
	}
	


