package pdf2_Operations;
/*
 *  Write a method for 
 *  increment and decrement operators(++, --)
 */
public class Question_2{
	
	
	int a = 10;

	
	public void increment() {

		a++; // a + 1
		System.out.println(a);
	}
	public void decrement() {

		a--; // a - 1
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		Question_2 method = new Question_2();
		method.increment();
		method.decrement();

	}

}
