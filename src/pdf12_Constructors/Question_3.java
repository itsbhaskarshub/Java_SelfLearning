package pdf12_Constructors;

/*
 * 3. Apply private, public, protected and default access modifiers to the constructor
 */
public class Question_3 {
	
	// public constructor
	public void get_PublicData(int a){
		System.out.println("public constructor a:"+ a);
	}
	
	private void get_PrivateData(int a){
		System.out.println("private constructor a:"+ a);
	}
	protected void get_ProtectedData(int a){
		System.out.println("protected constructor a:"+ a);
	}
	void get_DefaultData(int a){
		System.out.println("default constructor a:"+ a);
	}
	
	public static void main(String[] args) {
		Question_3 q = new Question_3();
		q.get_PublicData(10);
		q.get_PrivateData(10);
		q.get_ProtectedData(10);
		q.get_DefaultData(10);
	}

}
