package pdf1_Java_Basics;

/*Define the local and Global variables 
 * with the same name 
 * and print both variables and 
 * understand the scope of the variables
 * 
 */

public class Question_5 {

	int a = 10;
	public void gobalVariable() {
		System.out.println(a);
	}
	public void localVariable() {
		int a = 10;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {

		Question_5 q = new Question_5();
		q.gobalVariable();
		q.localVariable();

	}
	
	
	


}
