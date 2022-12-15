package pdf14_Exceptions;

import java.lang.reflect.Field;

public class Question_13 {
	
	/*
	 * 13. Write a program to generate NoSuchFieldException

	 */
	
	public static void main(String[] args) {
		
		try {
			String s = new String();
			Class c = s.getClass();
			Field f = c.getField("name");
			System.out.println(f.toString());
			} 
		catch (NoSuchFieldException e) 
			{
		      System.out.println("Exception: " + e);
			} 
		System.out.println("Program finished");

	}
	
}
