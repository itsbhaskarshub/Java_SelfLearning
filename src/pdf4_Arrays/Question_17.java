package pdf4_Arrays;


/*
17. Write a method to verify if the array 
contains two specified elements(12,23)


*/

public class Question_17 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,15,12,9,10,25,60,13,14};
		
		int size = arr.length-1;
		
		for(int i = 0; i<=size; i++) {
				if(arr[i] ==12 || arr[i] ==23) {
					System.out.println(arr[i]+" is a Found in array");
	
				}
				else {
					System.out.println("12 and 23 are not Found in array");

			}
		}

				
			}
		}		
	



 		


		
 




