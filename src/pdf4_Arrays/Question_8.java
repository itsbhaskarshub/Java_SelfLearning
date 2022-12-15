package pdf4_Arrays;

import java.util.Arrays;

/*
8. Write a function to find the minimum 
and maximum value of an array

*/

public class Question_8 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,13,14};
		
		int index =  arr.length-1;
		Arrays.sort(arr);
		
		int min = arr[0];
		System.out.println(min);
		
		int max = arr[index];
		System.out.println(max);
		
		}
	}

 		


		
 




