package pdf5_static;
/*
6. Print all the static, instance variables in main method

 */

public class Question_6 {
	
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
		Question_6.static_add();
		Question_6.static_subtract();
		
		Question_6 method = new Question_6();
		method.add();
		method.subtract();
		
	}
	
}
