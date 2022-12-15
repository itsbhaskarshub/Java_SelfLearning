package pdf12_Constructors;

public class Question_5 {
	
//	5. Try to call the constructor multiple times with the same object

	int getData(int a, int b){
		int c = a+b;
		return c;
	}
	

	
	public static void main(String[] args) {
		
		Question_5 q = new Question_5();
	
		for(int i = 0; i<=10; i++) {
			for(int j = 10; j<=20; j++) {
				int number = q.getData(i, j);
				System.out.println(i+"+"+j+" is "+number);

		}

	}

}
}
