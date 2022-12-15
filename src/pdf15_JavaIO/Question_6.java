package pdf15_JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Question_6 {

/*
* 6. Write a program to write text to .txt file using FileWriter
*/
	static String OutputFilePath = "..//JalaAcademy/TextFile/FileWriterOutputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(OutputFilePath);
		FileWriter fw = new FileWriter(file);
		String text = "Hello World";
		
		fw.write(text);
		fw.flush();
		System.out.println("Hello World");
		
		}
}
