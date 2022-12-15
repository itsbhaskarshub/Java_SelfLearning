package pdf6_Strings;

public class Question_11 {
	
	/*
11. Splitting strings with split()
	 */

	public static void main(String[] args) {
		
		String  string_literal= "Hello_jala_Tech";
		String[] replace_String = string_literal.split("jala");
		
		System.out.println(replace_String[0]);
		System.out.println(replace_String[1]);


	}
}
