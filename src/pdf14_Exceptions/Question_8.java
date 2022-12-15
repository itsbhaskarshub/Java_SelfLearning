package pdf14_Exceptions;

public class Question_8 {
	
	/*
	 * 8. Write a program to generate Arithmetic Exception
	 */

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException c) {
			System.out.println("Denominator should not zero");
		}
	}
	
}
