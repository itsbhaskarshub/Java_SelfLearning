package pdf4_Arrays;

import java.util.Arrays;

/*
18. Write a program to remove the duplicate 
elements and return the new array
*/

public class Question_18 {
	
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
		
		int[] a = new int[size+1];
			for(int i = 0; i<=size; i++) {
				a[i] = arr[i];
				System.out.print(a[i]+" ");				
			}
		}		
	}



 		


		
 




