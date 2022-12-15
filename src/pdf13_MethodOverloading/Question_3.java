package pdf13_MethodOverloading;

public class Question_3 {
	
/*
3. Write two methods with the same name and same number of parameters of same type 
and call from main method
*/
	
	void getData(int a, int b) {
		System.out.println(a+","+b);
	}
	
	void getData(int a, int b) {
		System.out.println(a+","+b);
	}

	public static void main(String[] args) {
		Question_3 q = new Question_3();
		q.getData(10, 20);
	}
}

// Program will Execute by Error for need For Duplicate name