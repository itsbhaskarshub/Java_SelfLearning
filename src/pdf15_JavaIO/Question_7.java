package pdf15_JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Question_7 {

/*
7. Read text from a .txt file using BufferedReader
*/

	static String InputFilePath = "..//JalaAcademy/TextFile/InputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(InputFilePath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		int text;
		while((text = br.read()) != -1) {
			System.out.print((char) text);
		}

		}
}
