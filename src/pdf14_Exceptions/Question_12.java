package pdf14_Exceptions;

import java.util.*;

public class Question_12 {
	
	/*
	 * 12. Write a program to generate IOException

	 */
	
		public static void main(String[] arg) throws Exception{
		  
		        String s = "Java";
		        Scanner scanner = new Scanner(s);	  
		        System.out.println("" + scanner.nextLine());
		        System.out.println("" + scanner.ioException());
		        scanner.close();
		
		
	}
	

}
