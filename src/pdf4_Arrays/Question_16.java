package pdf4_Arrays;

import java.util.Arrays;

/*
16. Write a function to get the difference of 
largest and smallest value
*/

public class Question_16 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,13,14};
		
		int index =  arr.length-1;
		Arrays.sort(arr);
		
		int min = arr[0];
		
		int max = arr[index];
		int diff = max - min;
		System.out.println(diff);
		
		}
	}

 		


		
 




