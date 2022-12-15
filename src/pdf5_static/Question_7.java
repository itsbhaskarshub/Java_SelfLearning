package pdf5_static;
/*
7. Call static methods and instance methods in main method
 */

public class Question_7 {
	
	// instance Variable
	int a = 10;
	int b = 12;

	// static variable
	
	static int c =13;
	static int d = 14;
	
	void add() {
		int e = a+b;
		System.out.println(e);	
	}
	void subtract() {
		int e = a-b;
		System.out.println(e);
		
	}
	
	static void static_add() {
		int e = c+d;
		System.out.println(e);	
	}
	static void static_subtract() {
		int e = c-d;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		// no need to create an object for method to call
		Question_7.static_add();
		Question_7.static_subtract();
		
		Question_7 method = new Question_7();
		method.add();
		method.subtract();
		
	}
	
}
