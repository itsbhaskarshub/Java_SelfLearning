package pdf6_Strings;

public class Question_14 {
	
	/*
14. Converting to upper case and lower case
	 */

	public static void main(String[] args) {
		
		String  string_literal= "Hello_jala_Tech";
		String String_Object = new String("Hello_jala_Tech");
		
		// BY Literal method
		System.out.println(string_literal.toUpperCase());
		
		// By Object method
		System.out.println(String_Object.toLowerCase());

	}
}
