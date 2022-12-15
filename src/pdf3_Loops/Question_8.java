package pdf3_Loops;

import java.util.Scanner;

/*
8. Write a program to find Armstrong number or not
 */

public class Question_8 {
	
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		int n =sc.nextInt();
		int x = 0,sum = 0;
	
		while(n>0) {
			int d = n %10;
			sum = sum + (d*d*d);
			n =x/10;
		}
		
		if(x ==n) {
			System.out.println(" Armstrong number ");
		}
		else {
			System.out.println("not Armstrong number ");

		}
	
	
}
}


