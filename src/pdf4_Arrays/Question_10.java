package pdf4_Arrays;

import java.util.Arrays;

/*
10. Write a function to find the duplicate 
values of an array
*/

public class Question_10 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,9,10,25,60,13,14};
		
		
		Arrays.sort(arr);
		
		for(int i = 1; i<arr.length-1; i++) {
			for(int j = 0; j<i; j++) {

			if(arr[j]==arr[i]) {
				System.out.println(arr[j]);
			}
			
		}	

		}
	}
}


 		


		
 




