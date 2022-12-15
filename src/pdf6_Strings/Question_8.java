package pdf6_Strings;

public class Question_8 {
	
	/*
8. equalsIgnoreCase(),
 startsWith(), 
 endsWith() and compareTo()
	 */

	public static void main(String[] args) {
		
		String  string_literal= "Hello_jala_Tech";
		String String_Object = new String("Hello_jala_Tech");
		// equalsIgnoreCase
		System.out.println(string_literal.equalsIgnoreCase(String_Object));
		// startsWith
		System.out.println(string_literal.startsWith("H"));
		//endsWith
		System.out.println(string_literal.endsWith("l"));
		//compareTo
		System.out.println(string_literal.compareTo(String_Object));

	}
}
