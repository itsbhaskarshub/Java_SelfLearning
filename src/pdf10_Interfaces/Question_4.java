package pdf10_Interfaces;

/*
3. Use Interface instances to call the implemented method in the implemented class
4. Create two interfaces with one method each. Implement these two interfaces in one 
class.

 */
public class Question_4 implements Question_3 {

	@Override
	public void getString_data() {
		System.out.println("Implemented");
		
	}

	public static void main(String[] args) {
		Question_4 oi = new Question_4();
		oi.getString_data();
		oi.getInteger_data();
	}

	@Override
	public void getInteger_data() {
		// TODO Auto-generated method stub
		System.out.println(123);

	}
}
