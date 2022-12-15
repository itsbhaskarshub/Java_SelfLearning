package pdf14_Exceptions;

public class Question_1 {
/*
 * 1. Write a program to generate Arithmetic Exception without exception handling
 */
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		int c = a/b;
		
		System.out.println(c);
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at pdf14_Exceptions.Question_1.main(Question_1.java:14)
*/