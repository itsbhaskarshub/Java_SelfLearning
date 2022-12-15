package pdf11_thisandsuper;


// 5. Call constructor of the parent class using super()


public class Question_6 extends Parent_Class{
	
	String Employee_Code = "EMP";
	int Employee_id = 10001;
	
	void full_Name() {
		
		String full_name = super.First_Name + " " + super.Last_Name;
		System.out.println(full_name);
		
	}
	
	void User_EmployeeID() {
			
		
		String Employee_id = this.Employee_Code+this.Employee_id; 
		System.out.println(Employee_id);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Question_6 q6 =new Question_6();
		q6.full_Name();
		q6.User_EmployeeID();

}}
