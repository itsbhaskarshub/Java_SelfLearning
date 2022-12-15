package pdf15_JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Question_9 {

/*
 * 9. Write a program to read data from properties file.
 */
	
	public static void main(String[] args) throws IOException {
		
		String credentials = "..//JalaAcademy/TextFile/Credentials.properties";
		FileInputStream fis = new FileInputStream(credentials);
		Properties pro = new Properties();
		pro.load(fis);
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println(username);
		System.out.println(password);
	}
			
}



