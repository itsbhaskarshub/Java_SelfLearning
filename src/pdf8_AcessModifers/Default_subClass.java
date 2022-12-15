package pdf8_AcessModifers;


/*
 *  Create a class with PRIVATE fields, private method and a main method. Print the fields 
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.


 */
public class Default_subClass extends Default{
	
	 
	public static void main(String[] args) {
		Default_subClass default_method = new Default_subClass();
		default_method.getData_string();
		default_method.getData_integers();
		default_method.getData_Digits();
		
		
	
	}
}
