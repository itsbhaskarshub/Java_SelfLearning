package pdf14_Exceptions;

public class Question_9 {

/*
 * 9. Write a program to generate ArrayIndexOutOfBoundException
 */
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println(a[5]);
/*
 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
at pdf14_Exceptions.Question_9.main(Question_9.java:12)

 */
	
	}
}
