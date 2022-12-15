package pdf9_AbstractClass;
/*
 * 1. Create an abstract class with abstract and non-abstract methods.
2. Create a sub class for an abstract class. Create an object in the child class for the 
abstract class and access the non-abstract methods
3. Create an instance for the child class in child class and call abstract methods
4. Create an instance for the child class in child class and call non-abstract methods
 */
abstract class Abstract_Class {
	
	
	String name = "Java Program";
	int number = 123;
	
	void getString_String() {
		System.out.println(name);
	}
	
	void getString_String2(String name2) {
		System.out.println(name2);
	}
	
	abstract void getInterger_Data();
}
