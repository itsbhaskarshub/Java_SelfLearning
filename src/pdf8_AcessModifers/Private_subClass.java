package pdf8_AcessModifers;


/*
 *  Create a class with PRIVATE fields, private method and a main method. Print the fields 
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.


 */
public class Private_subClass extends Private{
	
	 
	public static void main(String[] args) {
		Private private_method = new Private();
		private_method.getData();
		
		/*
		 * 	The method getData() from the type 
		 * Private is not visible
		 */
	}
}
