package pdf9_AbstractClass;

public class Abstract_ChildClass extends Abstract_Class{
	
	public static void main(String[] args) {
		Abstract_ChildClass acc = new Abstract_ChildClass();
		acc.getString_String();
		
		
		// 3. Create an instance for the child class in child class and call abstract methods
		acc.getInterger_Data();
		// 4. Create an instance for the child class in child class and call non-abstract methods
		String name = "hello World";
		acc.getString_String2(name);
		
	}

	@Override
	void getInterger_Data() {
		// TODO Auto-generated method stub
		System.out.println(number);
	}

}
