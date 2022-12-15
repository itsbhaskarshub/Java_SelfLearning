package pdf10_Interfaces;
/*
 * 7. Create an interface and inherit it from the other interface.
 */
public class Question_7 implements Question_7_Child{

	@Override
	public void getString_ParentData() {
		System.out.println("Hello i am Parent");
		
	}

	@Override
	public void getString_ChildData() {
		System.out.println("Hello i am Child");
		
	}
	
	public static void main(String[] args) {
		
		Question_7 q7 = new Question_7();
		q7.getString_ChildData();
		q7.getString_ParentData();
	}

}
