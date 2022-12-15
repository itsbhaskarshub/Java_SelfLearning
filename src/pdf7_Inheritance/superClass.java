package pdf7_Inheritance;

public class superClass extends C {
	
	
	public static void main(String[] args) {
		
		C c = new superClass();
		int x = c.class_B1_method(10, 20);
		int y = c.class_C1_method(15, 30);
		
		c.class_A1_method(x, y);
		
	}

}
