package pdf15_JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Question_8 {

/*
8. Write text to a .txt file using BufferedWriter
*/
	static String OutputFilePath = "..//JalaAcademy/TextFile/BufferedWriterOutputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(OutputFilePath);
		FileWriter fw = new FileWriter(file);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		String text = "Hello World";
		
		bw.write(text);
		bw.flush();
		System.out.println("Hello World");
		
		}
	
}
