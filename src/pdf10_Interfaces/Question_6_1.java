package pdf10_Interfaces;

public interface Question_6_1 {
	
	 default void getString_data() 
	 {
		 String name = "Java";
		 System.out.println(name);
	 }
	 
	 default void getInteger_data() 
	 {
		 int number = 123;
		 System.out.println(number);
	 }

}
