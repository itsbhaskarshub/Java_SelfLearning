package pdf15_JavaIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Question_3 {

	/*
	 * 3. Read text from a .txt file using BufferedInputStream
	 */

	static String InputFilePath = "..//JalaAcademy/TextFile/InputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(InputFilePath);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int text = bis.read();
		
		while(text != -1) {
			System.out.print((char) text);
			text = bis.read();
		}
		bis.close();

		}
}
