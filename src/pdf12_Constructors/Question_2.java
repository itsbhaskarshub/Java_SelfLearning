package pdf12_Constructors;

public class Question_2 extends Question_2_SuperClass{
	/*
	 * 2. Call the constructors(both default and argument constructors) of super class from a child 
class
	 */
	public static void main(String[] args) {
		
		Question_2 q = new Question_2();
		//  calling Default constructor
		int defult = q.getData();
		System.out.println(defult);
		
		//  calling argument constructor
		int arg = q.getData(20, 30);
		System.out.println(arg);

	}

}
