package pdf10_Interfaces;

/*
 * 8. Create a PUBLIC interface with fields and methods, fields should have values assigned. 
Implement this interface to some class and print the values of the interface fields and 
call the interface methods
 */

public class Question_8 implements Question_6_1, Question_6_2 {

	
	@Override
	public void getString_data() {
		Question_6_1.super.getString_data();
		Question_6_2.super.getString_data();

	}

	@Override
	public void getInteger_data() {
		Question_6_1.super.getInteger_data();
		Question_6_2.super.getInteger_data();

	}
	
	public static void main(String[] args) {
		
		Question_8 q6 = new Question_8();
		q6.getString_data();
		q6.getInteger_data();
	}




	
	
		
}
