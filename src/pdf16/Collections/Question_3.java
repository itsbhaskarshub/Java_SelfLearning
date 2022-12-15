package pdf16.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Question_3 {
	
	private static final boolean studentId = false;

	public static void main(String[] args) {
		
//		3. Create a HashSet with at least 10 elements of type String
//		Write program covering all the operations of HashSet

		HashSet<String> set = new HashSet<String>();
		set.add("Student1");
		set.add("Student2");
		set.add("Student3");
		set.add("Student4");
		set.add("Student5");
		set.add("Student6");
		set.add("Student7");
		set.add("Student8");
		set.add("Student9");
		set.add("Student10");
//		print all
		
		System.out.println(set);
		
// 		remove
		set.remove("Student10");
		
//		Print all
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}
}


