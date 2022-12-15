package pdf10_Interfaces;

/*
 * 5. Create two interfaces with the same method (same signature) in both the interfaces. 
Implement these two interfaces in one class. Call the method.
 */

public class Question_5 implements Question_5_1, Question_5_2 {


	@Override
	public void getString_data(String name) {
		System.out.println(name);
	}

	@Override
	public void getInteger_data(int number) {
		System.out.println(number);
	}
	
	@Override
	public void getString_data() {
		System.out.println("Implement 5_2");
	}

	@Override
	public void getInteger_data() {
		System.out.println(123);
		
	}
	public static void main(String[] args) {
		Question_5 q5 =new Question_5();
		q5.getString_data();
		q5.getInteger_data();
		
		q5.getString_data("Implement");
		q5.getInteger_data(123);
		
	}
}
