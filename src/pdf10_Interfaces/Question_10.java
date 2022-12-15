package pdf10_Interfaces;

public class Question_10 implements Interface_Modifier{

	@Override
	public void getString_privatecData() {
		String name = "Private Interface Name";
		System.out.println(name);		
	}

	@Override
	public void getString_publicData() {
		String name = "Public Interface Name";
		System.out.println(name);		
	}

	@Override
	public void getString_protectedData() {
		String name = "Protected Interface Name";
		System.out.println(name);		
	}
	@Override
	public void getString_finalData() {
		String name = "Final Interface Name";
		System.out.println(name);		
	}
	public void getString_staticData() {
		String name = "Static Interface Name";
		System.out.println(name);		
	}
	

	public static void main(String[] args) {
		
		Question_10 q10 = new Question_10();
		q10.getString_privatecData();
		q10.getString_publicData();
		q10.getString_protectedData();

	
		
	}


}
