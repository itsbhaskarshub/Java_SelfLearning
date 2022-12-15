package pdf14_Exceptions;

public class Question_5 {
	
	/*
	 * 5. Write a program to throw exception with your own message
	 */

	public static void main(String[] args) {
		int age = 13;
		if (age < 18) {
			throw new ArithmeticException("Age is Below 18");
		}
		else {
			System.out.println("Age is Above 18");
		}
		System.out.println(" Age is Invalid");
	}
	
}
