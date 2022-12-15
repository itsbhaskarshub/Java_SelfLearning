package pdf8_AcessModifers;


/*
2. Create a class with DEFAULT fields and methods. Access these fields and methods 
from any other class in the same package


 */
public class Default {
	
	String name = "Alpha";
	int number = 10;
	double digits = 10.05;
	
	void getData_string() {
		System.out.println(name);
	}
	void getData_integers() {
		System.out.println(number);
	}
	void getData_Digits() {
		System.out.println(digits);
	}

	
}
