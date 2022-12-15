package pdf15_JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question_2 {

	/*
	 * 2. Write a program to write text to .txt file using OutputStream
	 */
	static String OutputFilePath = "..//JalaAcademy/TextFile/OutputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(OutputFilePath);
		FileOutputStream fos = new FileOutputStream(file);
		String text = System.getProperty("line.seperator");
		fos.write("Hello World".getBytes());
		System.out.println("Hello World");
		
		}
}
