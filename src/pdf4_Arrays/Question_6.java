package pdf4_Arrays;

/*
6. Write a function to copy an array to another array
*/

public class Question_6 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println(" ");
		
			for(int j = arr.length-1; j>=0; j--) {
				int a[] = new int[5];
				a[j]= arr[j];
				System.out.print(a[j]+" ");

				}
			}

 		}


		
 




