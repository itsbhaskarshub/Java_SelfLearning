package pdf2_Operations;
/*
 *  5. Programs on Logical AND,OR operator and Logical NOT
 */
public class Question_5{
	
	int a = 10, b = 11, c = 12;
 
	public void and_Operator() {
		if(a<b && a<c) {
			System.out.println("a is smallest integer");
		}
		else if (a>b && b<c){
			System.out.println("b is smallest integer");
		}
		else {
			System.out.println("c is smallest integer");
		}
	}
	
	public void or_Operator() {
		if(a<b || a<c) {
			System.out.println("a is less than b and c");
		}
		else if (a>b || b<c){
			System.out.println("b is less than a and c");
		}
		else {
			System.out.println("c is less than a and b");
		}
	}
	 
	public static void main(String[] args) {
		Question_5 method = new Question_5();
		//  for and Operator
		method.and_Operator();
		// for or Operator
		method.or_Operator();		
	}

}
