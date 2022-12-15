package pdf14_Exceptions;

import java.lang.reflect.Method;

public class Question_14 {
	
	/*
	 * 14. Write a program to generate NoSuchMethodException
	 */
	
	public static void main(String[] args) {
		
		
			try
			{
				Class c = Class.forName("java.lang.String");
				Class[] a = new Class[1];
				Method m = c.getDeclaredMethod("Method", a);
			} 
			catch (ClassNotFoundException | NoSuchMethodException  e) 
			{
				// TODO Auto-generated catch block
			      System.out.println("Exception1: " + e);
			}
			
			

	}
	
}
