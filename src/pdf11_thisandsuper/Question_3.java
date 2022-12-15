package pdf11_thisandsuper;

public class Question_3 {
	
// 3. Call constructor of the current class using this()

	int a = 100;
	int b = 200;
	
	void sum() {
		
		int a = 25;
		int b = 35;

		int c = a + b;
		
		System.out.println(c);
		
		int c1 = this.a + this.b;
		
		System.out.println(c1);

		
	}

	public static void main(String[] args) {
		
		Question_3 q3 = new Question_3();
		q3.sum();
		
	}
}
