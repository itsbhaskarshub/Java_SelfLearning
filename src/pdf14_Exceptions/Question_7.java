package pdf14_Exceptions;

public class Question_7 {

	/*
	 * 7. Write a program with finally block

	 */
	
	public static void main(String[] args) {
		
		
		try {
			int a = 10;
			int b = 0;
			int c =a/b;
			System.out.println(c);
		} 
		finally {
			System.out.println("Denominator is should not Zero");
			} 
	}
	
	
}
