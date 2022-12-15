package pdf5_static;
/*
 * 2. Print instance variables in static methods
 */

public class Question_2 {
	
	// instance Variable
	int a = 0;
	int b = 0;


	static void static_add() {
		int e = a+b;
		System.out.println(e);	
	}

	
	public static void main(String[] args) {
		// no need to create an object for method to call
		Question_2 method = new Question_2();
		Question_2.static_add();

		/*
 			Cannot make a static reference to the 
 			non-static field a
			Cannot make a static reference to the 
			non-static field b
		 *
		 */
	}
	
}
