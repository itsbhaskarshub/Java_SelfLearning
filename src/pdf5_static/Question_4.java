package pdf5_static;
/*
4. Call instance methods in static methods

 */

public class Question_4 {
	
	static int a = 0;
	
	 void instance_method() {
		 a = 10;
		 System.out.println("a : "+ a);
		 
	 }
	 
	 static void static_method() {
		 a = 30;
		 instance_method();
	 }
	 
	 public static void main(String[] args) {
		 Question_4.static_method();
		 Question_4 q = new Question_4();
		 q.instance_method();
		 
		 /*
		  * Cannot make a static reference to the 
		  * non-static method "instance_method()"
		  * from the type Question_4
		  */
		 
	}
	 
	 
	
	}
	

