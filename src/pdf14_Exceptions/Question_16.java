package pdf14_Exceptions;

public class Question_16 {

	/*
	 * 16. Write a program to generate NumberFormatException
	 */
	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(null, 0);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("NumberFormatException :" +e);
		}

	}
}
