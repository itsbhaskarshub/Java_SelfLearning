package pdf14_Exceptions;

public class Question_2 {
/*
 * 2. Handle the Arithmetic exception using try-catch block
 */
	
	
	public static void main(String[] args) {
		
	try {
			int a = 10;
			int b = 0;	
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException");
		}
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at pdf14_Exceptions.Question_1.main(Question_1.java:14)
*/