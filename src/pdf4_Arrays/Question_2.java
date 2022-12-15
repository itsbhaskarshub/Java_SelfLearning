package pdf4_Arrays;

/*
2. Write a function to calculate the average value of an array of integers
 */

public class Question_2 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int sum =0;
		
	
		
		for(int i = 0; i<5;i++) {
			sum = sum + arr[i];
		}
		int avg = sum / 5;
		System.out.println(avg);
	}

}

