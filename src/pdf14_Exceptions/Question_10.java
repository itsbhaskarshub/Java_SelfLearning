package pdf14_Exceptions;

public class Question_10  {
	
	/*
	 * 10. Write a program to generate ClassNotFoundException
	 */

	public static void main(String[] args) {
		

		try {
			Class.forName("The Class do not Exist");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		
	}
	
	
	
}
