package pdf2_Operations;
/*
 *  Write a function for arithmetic operators(+,-,*,/)

 */
public class Question_1{
	
	
	int a = 10;
	int b = 5;
	int c;
	public void addition() {
		c = a+ b;
		System.out.println(c);
	}
	public void subtraction() {
		c = a- b;
		System.out.println(c);
	}
	public void multipication() {
		c = a* b;
		System.out.println(c);
	}
	public void division() {
		c = a/ b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Question_1 method = new Question_1();
		method.addition();
		method.subtraction();
		method.multipication();
		method.division();
	}

}
