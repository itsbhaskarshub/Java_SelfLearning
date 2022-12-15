package pdf10_Interfaces;

/*
 * 6. Create an interface with a default method and implement it in a class. Do not provide 
implementation to the default method and call the method.
 */

public class Question_6 implements Question_6_1, Question_6_2 {

	
	@Override
	public void getString_data() {
		// TODO Auto-generated method stub
		Question_6_1.super.getString_data();
		Question_6_2.super.getString_data();

	}

	@Override
	public void getInteger_data() {
		// TODO Auto-generated method stub
		Question_6_1.super.getInteger_data();
		Question_6_2.super.getInteger_data();

	}
	
	public static void main(String[] args) {
		
		Question_6 q6 = new Question_6();
		q6.getString_data();
		q6.getInteger_data();
	}




	
	
		
}
