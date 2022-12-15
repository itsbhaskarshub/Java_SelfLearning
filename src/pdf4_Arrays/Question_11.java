package pdf4_Arrays;

import java.util.Arrays;

/*
11. Write a program to find the common values 
between two arrays
*/

public class Question_11 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,13,14};
		
		
		for(int i = 1; i<arr.length; i++) {
			int first_number = arr[i];
			int second_number = arr[i-1];
			int diff = first_number - second_number;
			System.out.println(diff);
		}
		


		
		}
	}

 		


		
 




