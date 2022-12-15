package pdf4_Arrays;

import java.util.Arrays;

/*
12. Write a method to remove duplicate 
elements from an array

*/

public class Question_12 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,9,10,25,60,13,14};
		
		int size = arr.length-1;
		Arrays.sort(arr);
		
		for(int i = 0; i<=size; i++) {
			for(int j = i+1; j<=size; j++) {
				if(arr[i] == arr[j]) {
					for(int k = j; k<size; k++) {
						arr[k] =arr[k+1];
					}
					size--;
					j--;
				}
			}
		}
			for(int i = 0; i<=size; i++) {
				System.out.print(arr[i]+" ");
				
			}
		}		
	}



 		


		
 




