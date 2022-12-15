package pdf7_Inheritance;

public class Polymorphism extends C {

	// main method for calling Class A, Class B and Class C
		public static void main(String[] args) {
			C class_c = new C();
			
			// calling class c Methods one by one
			class_c.class_C1_method(10, 20);
			class_c.class_C2_method(10, 20, 30);
			
			// calling class B Methods one by one
			class_c.class_B1_method(15, 30);
			class_c.class_B2_method(15, 30, 45);
			
			// calling class A Methods one by one
			class_c.class_A1_method(20, 40);
			class_c.class_A2_method(20, 40, 60);
			



}
}
