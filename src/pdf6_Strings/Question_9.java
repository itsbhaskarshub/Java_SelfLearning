package pdf6_Strings;

public class Question_9 {
	
	/*
9. Trimming strings with trim()
	 */

	public static void main(String[] args) {
		
		String  string_literal= "Hello_jala_Tech";
		String[] string_Array = string_literal.split("_");
		
		System.out.println(string_Array[0]);
		System.out.println(string_Array[1]);
		System.out.println(string_Array[2]);

	}
}
