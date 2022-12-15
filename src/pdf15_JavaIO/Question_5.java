package pdf15_JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Question_5 {

	/*
	 * 5. Write a program to read text from .txt file using FileReader
	 */

	static String InputFilePath = "..//JalaAcademy/TextFile/InputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(InputFilePath);
		FileReader fr = new FileReader(file);
		
		
		int text;
		while((text = fr.read()) != -1) {
			System.out.print((char) text);
		}

		}
}
