package pdf2_Operations;
/*
 *  Write a program to find the two numbers equal or not.
 */
public class Question_4{
	
 
	public void equal(int a, int b) {
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b are not equal");
		}
	}
	

	
	public static void main(String[] args) {
		Question_4 method = new Question_4();
		
		// for equal
		method.equal(10, 10);
		method.equal(10, 11);

		
	}

}
