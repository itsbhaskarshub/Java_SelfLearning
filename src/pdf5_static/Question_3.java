package pdf5_static;
/*

3. Print static variables in Instance methods

 */

public class Question_3 {
	

	// static variable
	
	static int c =13;
	static int d = 14;
	// instance Method
	void add() {
		int e = c+d;
		System.out.println(e);	
	}

	public static void main(String[] args) {	
		Question_3 method = new Question_3();
		method.add();
	
	}
	
}
