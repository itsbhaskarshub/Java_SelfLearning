package pdf11_thisandsuper;

public class Question_1 {
	/*
	 1. Print the fields/instance members of the current class using this and without using object
	 */
	int a = 10;
	int b = 20;
	
	void addition() {
		
		int a = 5;
		int b = 10;
		
		int c = this.a + this.b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Question_1 q1 = new Question_1();
		q1.addition();
	}

}
