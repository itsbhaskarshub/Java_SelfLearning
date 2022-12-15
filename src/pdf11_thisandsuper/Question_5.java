package pdf11_thisandsuper;


// 5. Call constructor of the parent class using super()


public class Question_5 extends Parent_Class{
	
	
	void full_Name() {
		
		String full_name = super.First_Name + " " + super.Last_Name;
		System.out.println(full_name);
		
	}
	
	public static void main(String[] args) {
		
		Question_5 q5 =new Question_5();
		q5.full_Name();
	}

}
