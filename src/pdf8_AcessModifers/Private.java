package pdf8_AcessModifers;


/*
 *  Create a class with PRIVATE fields, private method and a main method. Print the fields 
in main method. Call the private method in main method.

 */
public class Private {
	
	private String name = "Alpha";
	
	private void getData() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Private private_method = new Private();
		private_method.getData();
	}
}
