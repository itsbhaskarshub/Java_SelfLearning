package pdf2_Operations;
/*
 *  Program to equal operator and not equal operators
 */
public class Question_3{
	
 
	public void equal(int a, int b) {
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b are not equal");
		}
	}
	
	public void not_equal(int a, int b) {
		if(a!=b) {
			System.out.println("a and b are not equal");
		}
		else {
			System.out.println("a and b are  equal");
		}
	}
	
	public static void main(String[] args) {
		Question_3 method = new Question_3();
		
		// for equal
		method.equal(10, 10);
		method.equal(10, 11);
		
		// not equal
		method.not_equal(10, 10);
		method.not_equal(10, 11);
		
	}

}
