package pdf10_Interfaces;

/*
 * 1. Create an interface with only one method and implement it in a class. Call the method 
implemented.
2. Create an interface with two methods, but implement only one in a class. Call the 
method implemented.

 */
public class Question_2 implements Question_1 {

	@Override
	public void getString_data() {
		System.out.println("Implemented");
		
	}

	public static void main(String[] args) {
		Question_2 oi = new Question_2();
		oi.getString_data();
	}
}
