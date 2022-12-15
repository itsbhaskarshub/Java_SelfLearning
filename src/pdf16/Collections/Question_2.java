package pdf16.Collections;

import java.util.HashMap;
import java.util.Iterator;


public class Question_2 {
	
	private static final boolean studentId = false;

	public static void main(String[] args) {
		
//		2. Create a HashMap with at least 10 key value pairs of the Student ID and Name

		HashMap<Integer, String> map = new HashMap<Integer, String>();

			
//		Insert a Key value mapping into the map
		map.put(10001, "Student1");
		map.put(10002, "Student2");
		map.put(10003, "Student3");
		map.put(10004, "Student4");
		map.put(10005, "Student5");
		map.put(10006, "Student6");
		map.put(10007, "Student7");
		map.put(10008, "Student8");
		map.put(10009, "Student9");
		map.put(10010, "Student10");
		

//		Fetch the value of a Key
		String fetch = map.get(10001);
		System.out.println(fetch);
		
//		Create a clone/copy of HashMap
		
		HashMap<Integer, String> new_Map = new HashMap<Integer, String>();
		new_Map.putAll(map);
		String fetch1 = new_Map.get(10001);
		System.out.println(fetch1);
//		Check if the given Key is in the Map
       if ( new_Map.containsKey(10005))
       {
    	   System.out.println("New hashmap contains key");
       }
       
//		Check if the value is in the Map
       if ( new_Map.containsValue("Student5"))
       {
    	   System.out.println("New hashmap contains Value");
       }
       
//		Check if the map is empty
       if ( new_Map == null || new_Map.isEmpty())
       {
    	   System.out.println("New hashmap contains Empty");
       }
       else
       {
    	   System.out.println("New hashmap contains keys and value");

       }
//		Print the size of the Map to the console
        int sizeofMap = new_Map.size();
        System.out.println(sizeofMap);
        
//		Print all the Keys of the map to the console
        
        Iterator<Integer> studenId = map.keySet().iterator();
        while (studenId.hasNext()) {
        	System.out.println(studenId.next());
        }
//		Print all the values of the map to the console
        Iterator<String> studetName = map.values().iterator();
        while (studetName.hasNext()) {
        	System.out.println(studetName.next());
        }
//		Remove a specific Key-value pair
        
        new_Map.remove(10005, "Student5");
        
        Iterator<Integer> studentRollno = new_Map.keySet().iterator();
        Iterator<String> student_Name = new_Map.values().iterator();
        
        while(studentRollno.hasNext()) {
        	while(student_Name.hasNext()) {
        		int srollno = studentRollno.next();
        		String name = student_Name.next();
        		System.out.println(srollno+" and "+ name);
        	}
        
        }
//		Copy all the elements of the Map to another Map

		new_Map.putAll(map);

	}

}
