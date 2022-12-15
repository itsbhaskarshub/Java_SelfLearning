package pdf14_Exceptions;


public class Question_15 {
	
	/*
	 * 15. Write a program to generate NullPointerException
	 */
	public static void main(String[] args) {
		
		String text = null;
		
		try {
			if (text.equals("java")) {
				System.out.println("Same");
				
			}
			else {
				System.out.println("Not Same");
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("NullPointerException : " + e);
		}
		
		
	}
}
