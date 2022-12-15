package pdf5_static;
/*
5. Call static methods in instance methods

 */

public class Question_5 {
	
	static int a = 0;
	
	 void instance_method() {
		 a = 10;
		 System.out.println("a : "+ a);
		 static_method();
	 }
	 
	 static void static_method() {
		 a = 30;
	 }
	 
	 public static void main(String[] args) {
		 Question_5 q = new Question_5();
		 
		 // calling instance variable
		 System.out.println("a : "+ a);
		 
		 // calling instance method
		 q.instance_method();
		 
		 // calling static_method
		 System.out.println("a : "+ a);

		 
	}
	}
	

