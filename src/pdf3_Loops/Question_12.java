package pdf3_Loops;

import java.util.Scanner;

/*
12. Print gender (Male/Female) program according to given M/F using switch

 */

public class Question_12 {
	

		public static  String M ;
		public static  String F;

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String gender =  sc.nextLine();
			
			switch (gender) {
			
			case  "M": case "m":
				System.out.println("MALE");
				break;
			case  "F": case "f":
				System.out.println("FEMALE");
				break;
		}


	}

}
