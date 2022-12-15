package pdf7_Inheritance;
/*
 * A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B. 
Create three methods in each class, 2 methods are specific to each class and third 
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main 
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above 
process only for data member
 */
public class A {

	void class_A1_method(int a, int b) {
		int sum =  a + b;
		System.out.println(sum + " from Class A Method 1");
	}
	
	void class_A2_method(int a, int b, int c) {
		int sum =  a + b + c;
		System.out.println(sum + " from Class A Method 2");
	}
	
	void class_A3_method(int c) {
		int a = 10, b = 20 ;
		int sum =  a + b + c;		
		System.out.println(sum + " from Class A Method 3");
	}
	
	
}
