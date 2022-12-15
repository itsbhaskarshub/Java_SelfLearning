package pdf13_MethodOverloading;

public class Question_1 {
	
/*
1. Write two methods with the same name but different number of parameters of same type 
and call the methods from main method
*/
	
	void getData(int a) {
		System.out.println(a);
	}
	
	void getData(int a, int b) {
		System.out.println(a+","+b);
	}

	public static void main(String[] args) {
		Question_1 q = new Question_1();
		q.getData(10);
		q.getData(10, 20);
	}
}
