package pdf13_MethodOverloading;

public class Question_5 {
	
/*
5. Write two methods with the same name, number of parameters and data type but 
different return Type
*/
	
	int getData(int a, int b) {
				
		int c = a+b;
		return c;
	}
	
	String getData(String a, String b) {
		
		String c = a +" "+ b;
		return c;
	}

	public static void main(String[] args) {
		Question_5 q = new Question_5();
		int sum = q.getData(10, 20);
		String user = q.getData("John", "Doe");
		System.out.println(user+ " age is " + sum);
	}
}

