package pdf13_MethodOverloading;

public class Question_4 {
	
/*
4. Write two methods with the same name and same number of parameters of different 
type and call from main method
*/
	
	void getData(int a, int b) {
		System.out.println(a+","+b);
	}
	
	void getData(String a, String b) {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		Question_4 q = new Question_4();
		q.getData(10, 20);
		q.getData("John", "Doe");
	}
}

