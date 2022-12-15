package pdf10_Interfaces;

public interface Question_6_2 {
	
	default void getString_data() 
	 {
		 String name = "Program";
		 System.out.println(name);
	 }
	 
	 default void getInteger_data() 
	 {
		 int number = 456;
		 System.out.println(number);
	 }

}
