package pdf14_Exceptions;

public class Question_6 {
	
	/*
	 * 6. Write a program to create your own exception
	 */

	public static void main(String[] args) throws Exception {
		int age = 13;
		if (age < 18) {
			throw new Exception("Age is Below 18");
		}
		else {
			System.out.println("Age is Above 18");
		}
		System.out.println(" Age is Invalid");
	}
	
}
