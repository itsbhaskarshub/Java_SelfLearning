package pdf3_Loops;

import java.util.Scanner;

/*
11. Program to check whether a number is EVEN or ODD using switch

 */

public class Question_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		switch (number % 2 ) {
			
		case  0:
			System.out.println("even");
			break;
		case  1:
			System.out.println("odd");
			break;
			
		}


	}

}
