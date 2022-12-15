package pdf3_Loops;


/*
9. Write a program to find the prime or not.
 */

public class Question_9 {
	
	public static void main(String[] args) {
		
		int count;
		for(int i =2; i<=100 ; i++) {
			count = 0;
			for(int j =2; j<=Math.sqrt(i) ; j++) {
				if(i%j==0) {
					count += 1;
					break;
				}
			}
			if(count == 0 && i !=1) {
				System.out.println("prime");
			}

		}
}
}


