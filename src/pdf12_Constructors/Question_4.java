package pdf12_Constructors;

public class Question_4 {
	
//	4. Write constructors with return type int and String

	int getData(int a, int b){
		int c = a+b;
		return c;
	}
	
	String getData(String firstname, String lastname){
		String username = firstname+ " "+ lastname;
		return username;
	}
	
	public static void main(String[] args) {
		
		Question_4 q = new Question_4();
		int number=q.getData(10, 20);
		String name =q.getData("John", "Doe");
		
		System.out.println(name + " "+ number);
	}

}
