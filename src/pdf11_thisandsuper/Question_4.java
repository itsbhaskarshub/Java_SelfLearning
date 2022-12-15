package pdf11_thisandsuper;

public class Question_4 {
	
//	4. Call argument constructor of current class using this()

	int number;
	String name;
	
	public void Username(String name) {
		System.out.println(name);
	}
	
	public void user_id(int number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		Question_4 q4 = new Question_4();
		q4.Username("John");
		q4.user_id(10001);
	}
}
