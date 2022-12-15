package pdf4_Arrays;

import java.util.Arrays;

/*
14. Write a method to find the second 
largest number in an array

*/

public class Question_14 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,9,10,25,60,13,14};
		
		int index = arr.length-1;
		
		Arrays.sort(arr);
		
		for(int i = index-1; i<arr.length; i++) {
			if(arr[i]<arr[index]) {
				System.out.println(arr[i]);
			}
			
		}	

		}
	}

 		


		
 




