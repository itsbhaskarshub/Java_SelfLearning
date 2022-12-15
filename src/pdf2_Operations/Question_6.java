package pdf2_Operations;
/*
 *  6. Program for relational operators (<,<==, >, >==)
 */
public class Question_6{
	
	public void operation(int a, int b, int c) {
		if (a<b) {
			
			String ans =  "a is lessthan b";
			System.out.println(ans);
		}
		else if (a<=b) {
			
			String ans =  "a is lessthan and equal b";
			System.out.println(ans);
		}
		
		else if (c>b) {
			
			String ans =  "a is greater than b";
			System.out.println(ans);
		}
		else if (c>=b) {
			
			String ans =  "a is greater than and equal  b";
			System.out.println(ans);
		}
		else 
		{
			System.out.println("ans = 0");
		}
		
	}
	

 
	public static void main(String[] args) {
		
		Question_6 method = new Question_6();
		method.operation(10, 11, 12);
		method.operation(11, 11, 12);
		method.operation(12, 11, 13);
		method.operation(13, 12, 12);


	}
	
		
	

}
