package pdf13_MethodOverloading;

public class Question_2 {
	
/*
2. Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method
*/
	
	void getData(int a) {
		System.out.println(a);
	}
	
	void getData(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Question_2 q = new Question_2();
		q.getData(10);
		q.getData("John Doe");
	}
}
