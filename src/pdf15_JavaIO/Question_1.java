package pdf15_JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Question_1 {

	/*
	 * 1. Write a program to read text from .txt file using InputStream
	 */

	static String InputFilePath = "..//JalaAcademy/TextFile/InputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(InputFilePath);
		FileInputStream fis = new FileInputStream(file);
		
		int text;
		while((text = fis.read()) != -1) {
			System.out.print((char) text);
		}

		}
}
