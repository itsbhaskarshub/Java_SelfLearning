package pdf4_Arrays;

/*
5. Write a function to remove a specific 
element from an array
*/

public class Question_5 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 40) {
				continue;
				}
			else {
				System.out.println(arr[i]);

			}

 		}
		

}
}


