package pdf5_static;
/*
 * 1. Write a class with 2 static variables, 
 * 2 Instance variables, 2 static methods, 2 instance 
methods and a main method.
 */

public class Question_1 {
	
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
		Question_1.static_add();
		Question_1.static_subtract();
		
		Question_1 method = new Question_1();
		method.add();
		method.subtract();
		
	}
	
}
