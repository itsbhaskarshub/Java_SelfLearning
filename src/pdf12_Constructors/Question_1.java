package pdf12_Constructors;

public class Question_1{
	
	/*
	 * 1. Write a class with a default constructor, one argument constructor and two argument 
constructors. Instantiate the class to call all the constructors of that class from a main 
class
	 */
	void getData() {
		int a = 10,b = 20,c;
		c =a +b;
		System.out.println(c);
		
	}
	
	void getData(int a) {
		int b = 20,c;
		c =a +b;
		System.out.println(c);
		
	}
	
	void getData(int a, int b) {
		int c =a +b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		Question_1 q = new Question_1();
		q.getData();
		q.getData(10);
		q.getData(10, 20);
		
		
		
	}
		

}
