package pdf14_Exceptions;

public class Question_4 {
/*
 * 4. Write a program with multiple catch blocks
 */
	public static void main(String[] args) {
		
		 try{    
             
			 int a[]=new int[5];    
             a[5]=30/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
		
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
at pdf14_Exceptions.Question_1.main(Question_1.java:14)
*/