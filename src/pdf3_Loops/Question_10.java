package pdf3_Loops;

import java.util.Scanner;

/*
10. Write a program to palindrome or not.
 */

public class Question_10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System. in) ;
		int num = scan.nextInt() ;
		int temp = num;
		int rem, res=0;

		while (temp!=0) 
		{
			rem = temp*10;
			res = res*10+ rem;
			temp = temp/10;
		}
		if (res!=num) {
			System.out.println( num+ " is a Palindrome" );
		}
		else {
			System.out.println(num+" is not a Palindrome");
		}
}
}


