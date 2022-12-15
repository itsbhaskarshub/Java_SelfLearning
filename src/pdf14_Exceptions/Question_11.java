package pdf14_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question_11 {
	
	public static void main(String[] args) throws FileNotFoundException   {
	
		/*
		 * 11. Write a program to generate FileNotFoundException

		 */
		String path = "c://java.txt";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);;
		
		try {
			while(fis.read()!=-1) {
				System.out.println(fis.read());
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	

}
