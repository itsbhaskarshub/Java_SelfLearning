package pdf11_thisandsuper;

public class childClass extends Question_2{

	public void  addition() {
		int a = super.a;
		int b = super.b;
		int c = a+ b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		childClass q1 = new childClass();
		q1.addition();
	}
	
}
	
	
	
	
	

