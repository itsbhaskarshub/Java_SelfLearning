package pdf4_Arrays;


/*
 * 19. Write a function to find the missing
 *  number of sorted array of 1 to 100
 */

public class Question_19 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,7,8,9,10};
		int sum = 0, sum1 =0;
		
		int arr2[] = {1,2,3,4,5,6,7,8,9,10};
		 
		for(int i = 0; i<arr2.length; i++) {
			 arr2[i] =  i+1;	
				 }
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		for(int i = 0; i<arr2.length; i++) {
			sum1 = sum1 + arr2[i];
		}

		int missing_Number = sum1 - sum;
		System.out.println(missing_Number);
			 }
	 }

			 
		 

	
	
	

		


	


	



