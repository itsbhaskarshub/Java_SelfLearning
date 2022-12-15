package pdf14_Exceptions;

public class Question_3 {
/*
 * 3. Write a method which throws exception, Call that method in main class without try block
 */
	void Exception(int a, int b) {
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException");
		}
	}
	
	
	public static void main(String[] args) {
		
		Question_3 q = new Question_3();
		q.Exception(10, 0);
		
	
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at pdf14_Exceptions.Question_1.main(Question_1.java:14)
*/