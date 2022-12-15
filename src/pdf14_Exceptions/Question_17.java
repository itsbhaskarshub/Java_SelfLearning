package pdf14_Exceptions;

public class Question_17 {
	
/*
 * 17. Write a program to generate StringIndexOutOfBoundsException	
 */

	public static void main(String[] args) {
		
		String course ="Java Program";
		
		for(int i = 0; i<course.length();i++) {
			System.out.print(course.charAt(i));
		}
		System.out.println(" ");

		try {
			System.out.println(course.charAt(15));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException:"+e);
			}
		
		
	}
	
	
}
