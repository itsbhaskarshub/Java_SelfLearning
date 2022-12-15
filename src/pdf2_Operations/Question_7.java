package pdf2_Operations;
/*
 *  7. Print the smaller and larger number
 */
public class Question_7{
	
	int a = 10, b = 11, c = 12;
 
	public void and_Operator() {
		if(a<b && a<c) {
			System.out.println("a is smallest integer");
			if(b<c) {
				System.out.println("c is largest integer");
			}
			else {
				System.out.println("b is largest integer");
			}
		}
	}
 
	public static void main(String[] args) {
		Question_7 method = new Question_7();
		//7. Print the smaller and larger number
		method.and_Operator();
		
	}

}
